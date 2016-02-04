package data;

import java.util.ArrayList;

public class GroupeModule {

	private ArrayList<Module> listeModules;
	private String nomGroupe;
	
	public GroupeModule(String nomGroupe){
		this.setNomGroupe(nomGroupe);
		listeModules = new ArrayList<Module>();
	}
	
	public String getNomGroupe() {
		return nomGroupe;
	}

	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}

	public ArrayList<Module> getListeModules() {
		return listeModules;
	}

	public void setListeModules(ArrayList<Module> listeModules) {
		this.listeModules = listeModules;
	}
}
