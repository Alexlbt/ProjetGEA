package data;

import java.util.ArrayList;

import junit.framework.TestCase;


public class testEtudiant extends TestCase {

	String nom1 = "Ted";
	String prenom1 = "Mosby";
	String dateNaiss1 = "01/01/2016";
	int numEtu1 = 21403619;
	
	String nom2 = "Barney";
	String prenom2 = "Stinson";
	String dateNaiss2 = "02/01/2016";
	int numEtu2 = 21403789;
	
	Etudiant e1 = new Etudiant(nom1,prenom1,numEtu1,dateNaiss1);
	Etudiant e2 = new Etudiant(nom2,prenom2,numEtu2,dateNaiss2);
	
	String nomModule1 = "M0001 - Module 1";
	int bareme1 = 20;
	
	Module m1 = new Module(nom1,bareme1);
	
	public void testCreationEtudiant() {		
		assertNotNull(e1);
		assertEquals(nom1, e1.getNom());
		assertEquals(prenom1, e1.getPrenom());
		assertEquals(numEtu1, e1.getNumEtu());
		assertEquals(dateNaiss1, e1.getDateNaiss());
		
		assertNotNull(e2);
		assertEquals(nom2, e2.getNom());
		assertEquals(prenom2, e2.getPrenom());
		assertEquals(numEtu2, e2.getNumEtu());
		assertEquals(dateNaiss2, e2.getDateNaiss());
	}

	
	public void testInscriptionA1Module(){
		m1.ajoutEtudiant(e1);
		Etudiant Etudiant = m1.getEtudiant(e1);
		
		assertEquals(e1,Etudiant);
	}
	
    public void test2InscriptionA1Module(){
	   	try {
	   		m1.ajoutEtudiant(e1);
	   		m1.ajoutEtudiant(e1);		
			
	   		fail();
		} catch (Exception e) {
			assertTrue(true);
			// TODO: handle exception
		}
	}
}
