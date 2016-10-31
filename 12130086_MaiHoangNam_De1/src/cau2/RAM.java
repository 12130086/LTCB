package cau2;

public class RAM extends ComputerPart {
	private int capacity;
	private int busSpeed;

	public RAM(int capacity, int busSpeed, int warrantyTime, int price, Supplier supplier) {
		super(warrantyTime, price, supplier);
		this.capacity = capacity;
		this.busSpeed = busSpeed;
	}

	@Override
	public double promotePrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
