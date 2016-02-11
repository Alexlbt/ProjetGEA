package data;

import java.util.ArrayList;

import junit.framework.TestCase;

public class testGroupeModule extends TestCase {
	
	public void testCreationGroupeModule() {
		
		//creation de modules
		String nom1 = "M0001 - Module 1";
		int bareme1 = 20;
		
		String nom2 = "M0002 - Module 2";
		int bareme2 = 10;
		
		Module m1 = new Module(nom1,bareme1);
		Module m2 = new Module(nom2,bareme2);
		
		//liste de modules
		ArrayList<Module> listeModule1 = new ArrayList<Module>();
		ArrayList<Module> listeModule2 = new ArrayList<Module>();
		
		listeModule1.add(m1);
		
		listeModule2.add(m1);
		listeModule2.add(m2);
		
		//creation de groupe de modules
		String nomgrp1 = "Economie";
		String nomgrp2 = "Maths";
		
		GroupeModule grp1 = new GroupeModule(nomgrp1);
		GroupeModule grp2 = new GroupeModule(nomgrp2);
		
		grp1.getListeModules().add(m1);
		
		grp2.getListeModules().add(m1);
		grp2.getListeModules().add(m2);
		
		assertNotNull(grp1);
		assertEquals(nomgrp1, grp1.getNomGroupe());
		assertEquals(listeModule1, grp1.getListeModules());
		assertEquals(m1,grp1.getListeModules().get(1));
		
		assertNotNull(grp2);
		assertEquals(nomgrp2, grp2.getNomGroupe());
		assertEquals(listeModule2, grp2.getListeModules());
		assertEquals(m1,grp2.getListeModules().get(1));
		assertEquals(m2,grp2.getListeModules().get(2));
	}

}
