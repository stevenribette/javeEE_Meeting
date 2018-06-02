package file.web;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import file.modele.fileService;

@Path("/file")
public class fileRessource {
		
	@POST
	public void removeMeeting() {
		fileService service = new fileService();
		service.removeMeeting();
	}
}