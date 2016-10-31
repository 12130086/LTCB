package cau1;

public class HangSanXuat {
	private String tenHang;
	private String quocGia;

	public HangSanXuat(String tenHang, String quocGia) {
		this.tenHang = tenHang;
		this.quocGia = quocGia;
	}

	public boolean sameCompany(HangSanXuat hangSanXuat) {
		return (this.tenHang == hangSanXuat.tenHang) && (this.quocGia == hangSanXuat.quocGia);
	}

}
