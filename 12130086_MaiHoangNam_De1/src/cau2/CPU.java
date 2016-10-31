package cau2;

public class CPU extends ComputerPart {
	private String category;
	private double speed;

	public CPU(String category, double speed, int warrantyTime, int price, Supplier supplier) {
		super(warrantyTime, price, supplier);
		this.category = category;
		this.speed = speed;
	}

	@Override
	public double promotePrice() {
		// TODO Auto-generated method stub
		return price * 70 / 100;
	}

}
