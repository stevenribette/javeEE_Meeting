package meeting.modele;

import java.util.Date;

public class meeting {

	private String civilite;
	private String nom;
	private String prenom;
	private Boolean urgence;
	private Date date;
	
	public meeting(String civilite, String nom, String prenom, Boolean urgence) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.urgence = urgence;
		this.date = new Date();
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Boolean getUrgence() {
		return urgence;
	}
	
	public void setUrgence(Boolean urgence) {
		this.urgence = urgence;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}