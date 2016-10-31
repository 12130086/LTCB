package section5.lab1;

import junit.framework.TestCase;

public class TestInventory extends TestCase {
	public void testConstructor() {
		System.out.println("testConstructor");

		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory i0 = new MTInventory();
		Inventory i1 = new ConsInventory(doll, i0);
		Inventory i2 = new ConsInventory(robot, i1);
		Inventory i3 = new ConsInventory(gun, i2);
		System.out.println(i3);

		Inventory all = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		System.out.println(all);
	}

	public void testContains() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory ivt = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));

		assertTrue(ivt.contains("doll"));
		assertFalse(ivt.contains("car"));
	}

	public void testIsBellow() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory ivt = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));

		assertTrue(ivt.isBellow(23.0));
		assertFalse(ivt.isBellow(20.0));
	}

	public void testHowMany() {
		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory ivt = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));
		assertEquals(3, ivt.howMany());
	}

	public void testRaisePrice() {
		System.out.println("testRaisePrice");

		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory ivt = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));

		// before invoking raisePrice()
		System.out.println(ivt);

		// after invoking raisePrice()
		System.out.println(ivt.raisePrice(0.05));
	}

	public void testRaisePriceMutable() {
		System.out.println("testRaisePriceMutable");

		Toy doll = new Toy("doll", 17.95, 5);
		Toy robot = new Toy("robot", 22.05, 3);
		Toy gun = new Toy("gun", 15.0, 4);

		Inventory ivt = new ConsInventory(doll, new ConsInventory(robot, new ConsInventory(gun, new MTInventory())));

		// before invoking raisePriceMutable(rate)
		System.out.println(ivt);
		ivt.raisePriceMutable(0.05);

		// after invoking raisePriceMutable(rate)
		System.out.println(ivt);
	}
}
