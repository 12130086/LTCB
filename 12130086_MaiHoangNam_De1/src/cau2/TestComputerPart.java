package cau2;

import junit.framework.TestCase;

public class TestComputerPart extends TestCase {
	public void testContructor() {
		ComputerPart cp1 = new CPU("P4", 1, 3, 55, new Supplier("T&H", "TP.HCM"));
		ComputerPart cp2 = new Harddisk(40, 7200, 2, 45, new Supplier("Robo", "TP.HCM"));
		ComputerPart cp3 = new RAM(1, 133, 1, 25, new Supplier("Tran Anh", "Ha Noi"));
	}

	public void testComputerPart() {
		ComputerPart cp1 = new CPU("P4", 1, 3, 55, new Supplier("T&H", "TP.HCM"));
		ComputerPart cp2 = new Harddisk(40, 7200, 2, 45, new Supplier("Robo", "TP.HCM"));
		ComputerPart cp3 = new RAM(1, 133, 1, 25, new Supplier("Tran Anh", "Ha Noi"));

		// Test suppliedBy
		assertTrue(cp1.suppliedBy(new Supplier("T&H", "TP.HCM")));
		assertTrue(cp2.suppliedBy(new Supplier("Robo", "TP.HCM")));
		assertFalse(cp3.suppliedBy(new Supplier("T&H", "TP.HCM")));

		// Test promotePrice
		assertEquals(cp1.promotePrice(), 55 * 70 / 100, 0.01);
		assertEquals(cp2.promotePrice(), 35, 0.01);
		assertEquals(cp3.promotePrice(), 25, 0.01);
	}
}
