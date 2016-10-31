package cau2;

public class Supplier {
	private String companyName;
	private String address;

	public Supplier(String companyName, String address) {
		this.companyName = companyName;
		this.address = address;
	}

	public boolean suppliedBy(Supplier supplier) {
		return (this.companyName == supplier.companyName)
				&& (this.address == supplier.address);
	}

}
