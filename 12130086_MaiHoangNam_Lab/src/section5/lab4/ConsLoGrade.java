package section5.lab4;

public class ConsLoGrade extends ALoGrade {
	private GradeRecord first;
	private ALoGrade rest;

	public ConsLoGrade(GradeRecord first, ALoGrade rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public GradeRecord getFirst() {
		return first;
	}

	public void setFirst(GradeRecord first) {
		this.first = first;
	}

	public ALoGrade getRest() {
		return rest;
	}

	public void setRest(ALoGrade rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return this.first + "\n" + this.rest;
	}

	@Override
	public int howManyCredits() {
		return this.first.getCredits() + this.rest.howManyCredits();
	}

	@Override
	public double gradeAverage() {
		return ((this.first.getGrade() * this.first.getCredits()) / this.howManyCredits()) + this.rest.gradeAverage();
	}

	@Override
	public ALoGrade sortByGradeDec() {
		return this.rest.sortByGradeDec().insertInScoreOrder(this.first);
	}

	@Override
	public ALoGrade insertInScoreOrder(GradeRecord gr) {
		if (gr.hasScoreShorterThan(this.first))
			return new ConsLoGrade(gr, this);
		else
			return new ConsLoGrade(this.first, this.rest.insertInScoreOrder(gr));
	}

	@Override
	public ALoGrade greaterThanList(double thatGrade) {
		if (this.first.hasGreaterThan(thatGrade))
			return new ConsLoGrade(this.first, this.rest.greaterThanList(thatGrade));
		else
			return this.rest.greaterThanList(thatGrade);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLoGrade))
			return false;
		else {
			ConsLoGrade that = (ConsLoGrade) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
}
