package section5.lab4;

public class GradeRecord {
	private int number;
	private String title;
	private int credits;
	private double grade;

	public GradeRecord(int number, String title, int credits, double grade) {
		this.number = number;
		this.title = title;
		this.credits = credits;
		this.grade = grade;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return this.number + ", " + this.title + ", " + this.credits + ", " + this.grade;
	}

	public boolean hasScoreShorterThan(GradeRecord first) {
		return this.grade < first.grade;
	}

	public boolean hasGreaterThan(double thatGrade) {
		return this.grade > thatGrade;
	}

}
