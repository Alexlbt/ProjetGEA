package data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class testModules {

	public testModules() {
		String nom1 = "M0001 - Module 1";
		int bareme1 = 20;
		
		String nom2 = "M0002 - Module 2";
		int bareme2 = 10;
		
		Module m1 = new Module(nom1,bareme1);
		Module m2 = new Module(nom2,bareme2);
		
		assertNotNull(m1);
		assertEquals(nom1, m1.getNom());
		assertEquals(bareme1, m1.getBareme());
		
		assertNotNull(m2);
		assertEquals(nom2, m2.getNom());
		assertEquals(bareme2, m2.getBareme());
	}

}
