package meeting.web;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import meeting.modele.meetingInvalidException;
import meeting.modele.meetingService;

@Path("/meeting")
public class meetingRessource {
		
	@POST
	public void creerMeeting(
		@FormParam("civilite") String civilite,
		@FormParam("nom") String nom, 
		@FormParam("prenom") String prenom, 
		@FormParam("urgence") boolean urgence) 
		throws meetingInvalidException {
		
		meetingService service = new meetingService();
		service.rendez_vous(civilite, nom, prenom, urgence);
	}
}