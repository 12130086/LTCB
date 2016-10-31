package section5.lab4;

public abstract class ALoGrade {

	// tinh tong so tin chi trong bang diem ma sv dat duoc
	public abstract int howManyCredits();

	// tinh diem trung binh cua sinh vien
	public abstract double gradeAverage();

	// sap xep bang diem so theo thu tu giam dan
	public abstract ALoGrade sortByGradeDec();

	// insert the given entry into this sorted log
	public abstract ALoGrade insertInScoreOrder(GradeRecord gr);

	// Tra ve danh sach muc diem so cua sinh vien co diem lon hon mot gia tri
	// cho truoc
	public abstract ALoGrade greaterThanList(double thatGrade);

}
