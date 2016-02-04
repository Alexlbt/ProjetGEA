package data;

public class Module {

	private String nom;
	private int bareme;
	
	public Module(String nom, int bareme){
		this.setNom(nom);
		this.setBareme(bareme);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getBareme() {
		return bareme;
	}

	public void setBareme(int bareme) {
		this.bareme = bareme;
	}
}
