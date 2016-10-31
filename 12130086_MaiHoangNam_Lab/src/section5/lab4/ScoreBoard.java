package section5.lab4;

public class ScoreBoard {
	private String name;
	private String classYear;
	private ALoGrade loGrade;

	public ScoreBoard(String name, String classYear, ALoGrade loGrade) {
		this.name = name;
		this.classYear = classYear;
		this.loGrade = loGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassYear() {
		return classYear;
	}

	public void setClassYear(String classYear) {
		this.classYear = classYear;
	}

	public ALoGrade getLoGrade() {
		return loGrade;
	}

	public void setLoGrade(ALoGrade loGrade) {
		this.loGrade = loGrade;
	}

	@Override
	public String toString() {
		return "Score Board: " + this.name + ", " + this.classYear + "\n" + this.loGrade;
	}

}
