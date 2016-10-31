package section5.bus;

import junit.framework.TestCase;

public class TestBus extends TestCase {
	public void testConstructor() {
		Segment s1 = new Segment(new Station("Tram A", new Location(123, "Duong A")),
				new Station("Tram B", new Location(150, "Duong X")), 80);
		Segment s2 = new Segment(new Station("Tram A2", new Location(23, "Duong A2")),
				new Station("Tram B2", new Location(50, "Duong X2")), 55);
		Segment s3 = new Segment(new Station("Tram A3", new Location(1, "Duong A3")),
				new Station("Tram B3", new Location(10, "Duong X3")), 10);

		Segments sg0 = new MTSegments();
		Segments sg1 = new ConsSegments(s1, sg0);
		Segments sg2 = new ConsSegments(s2, sg1);
		Segments sg3 = new ConsSegments(s3, sg2);

		Route r = new Route("Tuyen AB", sg3);
		System.out.println(r);
	}

	public void testPassAcross() {
		Segment s1 = new Segment(new Station("Tram A", new Location(123, "Duong A")),
				new Station("Tram B", new Location(150, "Duong X")), 80);
		Segment s2 = new Segment(new Station("Tram A2", new Location(23, "Duong A2")),
				new Station("Tram B2", new Location(50, "Duong X2")), 55);
		Segment s3 = new Segment(new Station("Tram A3", new Location(1, "Duong A3")),
				new Station("Tram B3", new Location(10, "Duong X3")), 10);

		Segments sg0 = new MTSegments();
		Segments sg1 = new ConsSegments(s1, sg0);
		Segments sg2 = new ConsSegments(s2, sg1);
		Segments sg3 = new ConsSegments(s3, sg2);

		Route r = new Route("Tuyen AB", sg3);
		assertTrue(r.passAcross(s2));
		assertFalse(r.passAcross(new Segment(new Station("Tram TA", new Location(11, "Duong T")),
				new Station("Tram BB", new Location(1, "Duong XX")), 19)));
	}

	public void testHowLong() {
		Segment s1 = new Segment(new Station("Tram A", new Location(123, "Duong A")),
				new Station("Tram B", new Location(150, "Duong X")), 80);
		Segment s2 = new Segment(new Station("Tram A2", new Location(23, "Duong A2")),
				new Station("Tram B2", new Location(50, "Duong X2")), 55);
		Segment s3 = new Segment(new Station("Tram A3", new Location(1, "Duong A3")),
				new Station("Tram B3", new Location(10, "Duong X3")), 10);

		Segments sg0 = new MTSegments();
		Segments sg1 = new ConsSegments(s1, sg0);
		Segments sg2 = new ConsSegments(s2, sg1);
		Segments sg3 = new ConsSegments(s3, sg2);

		Route r = new Route("Tuyen AB", sg3);
		assertEquals(r.howLong(), 145, 0.001);
	}
}
