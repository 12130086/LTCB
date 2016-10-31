package cau2;

public abstract class ComputerPart {
	protected int warrantyTime;
	protected int price;
	protected Supplier supplier;

	public ComputerPart(int warrantyTime, int price, Supplier supplier) {
		this.warrantyTime = warrantyTime;
		this.price = price;
		this.supplier = supplier;
	}

	public boolean suppliedBy(Supplier supplier) {
		return this.supplier.suppliedBy(supplier);
	}

	public abstract double promotePrice();

}
