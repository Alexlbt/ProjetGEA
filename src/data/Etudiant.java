package data;

public class Etudiant {
	
	private String nom;
	private String prenom;
	private int numEtu;
	private String dateNaiss;
	
	public Etudiant(String nom, String prenom, int numEtu, String dateNaiss){
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setNumEtu(numEtu);
		this.setDateNaiss(dateNaiss);
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

	public int getNumEtu() {
		return numEtu;
	}

	public void setNumEtu(int numEtu) {
		this.numEtu = numEtu;
	}

	public String getDateNaiss() {
		return dateNaiss;
	}

	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
}
