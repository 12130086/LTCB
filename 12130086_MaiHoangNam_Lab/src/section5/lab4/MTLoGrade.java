package section5.lab4;

public class MTLoGrade extends ALoGrade {

	@Override
	public String toString() {
		return "";
	}

	@Override
	public int howManyCredits() {
		return 0;
	}

	@Override
	public double gradeAverage() {
		return 0.0;
	}

	@Override
	public ALoGrade sortByGradeDec() {
		return new MTLoGrade();
	}

	@Override
	public ALoGrade insertInScoreOrder(GradeRecord gr) {
		return new ConsLoGrade(gr, this); // this: MTLoGrade
	}

	@Override
	public ALoGrade greaterThanList(double thatGrade) {
		return new MTLoGrade();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTLoGrade))
			return false;
		return true;
	}
}
