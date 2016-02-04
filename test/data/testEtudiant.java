package data;

import junit.framework.TestCase;


public class testEtudiant extends TestCase {

	public testEtudiant() {
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

}
