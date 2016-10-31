package cau2;

public class Harddisk extends ComputerPart {
	private int capacity;
	private int rpm;

	public Harddisk(int capacity, int rpm, int warrantyTime, int price, Supplier supplier) {
		super(warrantyTime, price, supplier);
		this.capacity = capacity;
		this.rpm = rpm;
	}

	@Override
	public double promotePrice() {
		// TODO Auto-generated method stub
		return price - 10;
	}

}
