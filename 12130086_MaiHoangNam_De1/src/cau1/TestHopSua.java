package cau1;

import junit.framework.TestCase;

public class TestHopSua extends TestCase {
	@SuppressWarnings("unused")
	public void testContructor() {
		HopSua hs1 = new HopSua("Loai 1", "Dielac", 0.5, 130000, new QuyCachHop(12, 15),
				new HangSanXuat("VinaMilk", "Viet Nam"));
		HopSua hs2 = new HopSua("Loai 2", "Lactogen", 0.9, 235000, new QuyCachHop(15, 20),
				new HangSanXuat("Nestle", "Hoa Ky"));
		HopSua hs3 = new HopSua("Loai 3", "Ensure Gold", 0.9, 330000, new QuyCachHop(10, 13),
				new HangSanXuat("Abott", "Hoa Ky"));
	}

	public void testHopSua() {
		HopSua hs1 = new HopSua("Loai 1", "Dielac", 0.5, 130000, new QuyCachHop(12, 15),
				new HangSanXuat("VinaMilk", "Viet Nam"));
		HopSua hs2 = new HopSua("Loai 2", "Lactogen", 0.9, 235000, new QuyCachHop(15, 20),
				new HangSanXuat("Abott", "Hoa Ky"));
		HopSua hs3 = new HopSua("Loai 3", "Ensure Gold", 0.9, 330000, new QuyCachHop(10, 13),
				new HangSanXuat("Abott", "Hoa Ky"));

		// Test sameCompany
		assertTrue(hs2.sameCompany(hs3));
		assertFalse(hs2.sameCompany(hs1));
		assertFalse(hs1.sameCompany(hs3));

		// Test greaterThan
		assertTrue(hs1.greaterThan(hs3));
		assertFalse(hs3.greaterThan(hs2));
		assertTrue(hs2.greaterThan(hs1));
	}
}
