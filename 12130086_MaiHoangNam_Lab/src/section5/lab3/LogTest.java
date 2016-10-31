package section5.lab3;

import junit.framework.TestCase;

public class LogTest extends TestCase {
	public void testConstructor() {
		Entry e1 = new Entry(new Date(5, 5, 2005), 5.0, 25, "Good");
		Entry e2 = new Entry(new Date(6, 6, 2005), 3.0, 24, "Tired");
		Entry e3 = new Entry(new Date(23, 6, 2005), 26.0, 156, "Great");

		ALog empty = new MTLog();
		ALog l1 = new ConsLog(e1, empty);
		ALog l2 = new ConsLog(e2, l1);
		ALog l3 = new ConsLog(e3, l2);

		System.out.println(l3);

		ALog all = new ConsLog(e1, new ConsLog(e2, new ConsLog(e3, new MTLog())));
		System.out.println(all);
	}
}
