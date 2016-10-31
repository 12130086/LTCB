package cau1;

public class HopSua {
	private String loaiSua;
	private String tenSua;
	private double khoiLuongHop;
	private int giaBan;
	private QuyCachHop quyCachHop;
	private HangSanXuat hangSanXuat;

	public HopSua(String loaiSua, String tenSua, double khoiLuongHop, int giaBan, QuyCachHop quyCachHop,
			HangSanXuat hangSanXuat) {
		this.loaiSua = loaiSua;
		this.tenSua = tenSua;
		this.khoiLuongHop = khoiLuongHop;
		this.giaBan = giaBan;
		this.quyCachHop = quyCachHop;
		this.hangSanXuat = hangSanXuat;
	}

	public boolean sameCompany(HopSua hopSua) {
		return this.hangSanXuat.sameCompany(hopSua.hangSanXuat);
	}

	public boolean greaterThan(HopSua hopSua) {
		return this.quyCachHop.TheTich() > hopSua.quyCachHop.TheTich();
	}

}
