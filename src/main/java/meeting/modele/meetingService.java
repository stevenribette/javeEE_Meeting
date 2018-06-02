package meeting.modele;

public class meetingService {
	public meeting rendez_vous(String civilite, String nom, String prenom, boolean urgence) throws meetingInvalidException {
		meetingInvalidException ex = new meetingInvalidException();
		
		if (civilite == null) {
			ex.addMessage("civilite", "La civilité n'a pas était sélectionner !");
		}
		if (nom == null || nom.length() < 1) {
			ex.addMessage("nom", "Le nom doit être compléter !");
		}
		if (prenom == null || prenom.length() < 1) {
			ex.addMessage("prenom", "Le prenom doit être compléter !");
		}
		if (ex.mustBeThrown()) {
			throw ex;
		}
		
		return new meeting(civilite, nom, prenom, urgence);
	}
}
