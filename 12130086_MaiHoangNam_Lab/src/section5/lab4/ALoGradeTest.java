package section5.lab4;

import junit.framework.TestCase;

public class ALoGradeTest extends TestCase {
	public void testConstructor() {
		GradeRecord gr1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
		GradeRecord gr2 = new GradeRecord(220, "Basic Programming", 2, 5.0);
		GradeRecord gr3 = new GradeRecord(690, "Algorithms", 4, 7.0);
		GradeRecord gr4 = new GradeRecord(721, "Data Structure", 4, 8.0);

		ALoGrade empty = new MTLoGrade();
		ALoGrade l1 = new ConsLoGrade(gr1, empty);
		ALoGrade l2 = new ConsLoGrade(gr2, l1);
		ALoGrade l3 = new ConsLoGrade(gr3, l2);
		ALoGrade l4 = new ConsLoGrade(gr4, l3);
		System.out.println();
		System.out.println(l4);

		ALoGrade all = new ConsLoGrade(gr1,
				new ConsLoGrade(gr2, new ConsLoGrade(gr3, new ConsLoGrade(gr4, new MTLoGrade()))));
		System.out.println();
		System.out.println(all);

		ScoreBoard score = new ScoreBoard("Tran Van Tuan", "Khoa 2008", all);
		System.out.println();
		System.out.println(score);
	}

	public void testHowManyCredits() {
		GradeRecord gr1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
		GradeRecord gr2 = new GradeRecord(220, "Basic Programming", 2, 5.0);
		GradeRecord gr3 = new GradeRecord(690, "Algorithms", 4, 7.0);
		GradeRecord gr4 = new GradeRecord(721, "Data Structure", 4, 8.0);

		ALoGrade empty = new MTLoGrade();
		ALoGrade l1 = new ConsLoGrade(gr1, empty);
		ALoGrade l2 = new ConsLoGrade(gr2, l1);
		ALoGrade l3 = new ConsLoGrade(gr3, l2);
		ALoGrade l4 = new ConsLoGrade(gr4, l3);

		assertEquals(l1.howManyCredits(), 3);
		assertEquals(l2.howManyCredits(), 5);
		assertEquals(l3.howManyCredits(), 9);
		assertEquals(l4.howManyCredits(), 13);
	}

	// phuong thuc nay dang duoc xem xet lai
	@SuppressWarnings("unused")
	public void testGradeAverage() {
		GradeRecord gr1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
		GradeRecord gr2 = new GradeRecord(220, "Basic Programming", 2, 5.0);
		GradeRecord gr3 = new GradeRecord(690, "Algorithms", 4, 7.0);
		GradeRecord gr4 = new GradeRecord(721, "Data Structure", 4, 8.0);

		ALoGrade empty = new MTLoGrade();
		ALoGrade l1 = new ConsLoGrade(gr1, empty);
		ALoGrade l2 = new ConsLoGrade(gr2, l1);
		ALoGrade l3 = new ConsLoGrade(gr3, l2);
		ALoGrade l4 = new ConsLoGrade(gr4, l3);

		assertEquals(l1.gradeAverage(), 7.5, 0.001);
		assertEquals(l2.gradeAverage(), 9.5, 0.001); // ket qua?

	}

	public void testSortByScoreDec() {
		GradeRecord gr1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
		GradeRecord gr2 = new GradeRecord(220, "Basic Programming", 2, 5.0);
		GradeRecord gr3 = new GradeRecord(690, "Algorithms", 4, 7.0);
		GradeRecord gr4 = new GradeRecord(721, "Data Structure", 4, 8.0);

		ALoGrade empty = new MTLoGrade();
		ALoGrade ls1 = empty.insertInScoreOrder(gr1);
		ALoGrade ls2 = ls1.insertInScoreOrder(gr2);
		ALoGrade ls3 = ls2.insertInScoreOrder(gr3);
		ALoGrade ls4 = ls3.insertInScoreOrder(gr4);

		System.out.println("testSortByScoreDec");
		System.out.println(ls4);

	}

	public void testGreaterThanList() {
		GradeRecord gr1 = new GradeRecord(211, "Database Fundamentals", 3, 7.5);
		GradeRecord gr2 = new GradeRecord(220, "Basic Programming", 2, 5.0);
		GradeRecord gr3 = new GradeRecord(690, "Algorithms", 4, 7.0);
		GradeRecord gr4 = new GradeRecord(721, "Data Structure", 4, 8.0);

		ALoGrade empty = new MTLoGrade();
		ALoGrade l1 = new ConsLoGrade(gr1, empty);
		ALoGrade l2 = new ConsLoGrade(gr2, l1);
		ALoGrade l3 = new ConsLoGrade(gr3, l2);
		ALoGrade l4 = new ConsLoGrade(gr4, l3);

		assertTrue(empty.greaterThanList(6.5).equals(new MTLoGrade()));
		assertTrue(l1.greaterThanList(6.5).equals(new ConsLoGrade(gr1, new MTLoGrade())));
		assertFalse(l2.greaterThanList(6.5).equals(new ConsLoGrade(gr2, new ConsLoGrade(gr1, new MTLoGrade()))));
		assertFalse(l3.greaterThanList(6.5).equals(new ConsLoGrade(gr3, new ConsLoGrade(gr2, new MTLoGrade()))));
		assertFalse(l4.greaterThanList(6.5)
				.equals(new ConsLoGrade(gr4, new ConsLoGrade(gr3, new ConsLoGrade(gr2, new MTLoGrade())))));
	}
}
