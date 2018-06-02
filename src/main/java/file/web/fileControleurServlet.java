package file.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import meeting.modele.meeting;
import meeting.modele.meetingInvalidException;
import meeting.modele.meetingService;

@WebServlet("/file")
public class fileControleurServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/file/file.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setAttribute("meeting", 0);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jsp/file/file.jsp");
			rd.forward(req, resp);
		} finally{
			
		}
	}
}