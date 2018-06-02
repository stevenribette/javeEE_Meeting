package meeting.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import file.modele.file;
import meeting.modele.meeting;
import meeting.modele.meetingInvalidException;
import meeting.modele.meetingService;

@WebServlet("/meeting")
public class meetingControleurServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/meeting/meeting.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String civilite = req.getParameter("civlite");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		boolean urgence = Boolean.valueOf(req.getParameter("urgence"));
		try {
			meetingService meetingService = new meetingService();
			meeting meeting = meetingService.rendez_vous(civilite, nom, prenom, urgence);
			file.addMeeting(meeting);
			req.setAttribute("meeting", meeting);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/meeting/validationMeeting.jsp");
			rd.forward(req, resp);
		} catch (meetingInvalidException e) {
			req.setAttribute("errors", e.getMessages());
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/meeting/meeting.jsp");
			rd.forward(req, resp);
		}
	}
}