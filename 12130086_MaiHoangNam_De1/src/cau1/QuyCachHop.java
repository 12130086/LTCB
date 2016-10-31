package cau1;

public class QuyCachHop {
	private double duongKinhDay;
	private double chieuCao;

	public QuyCachHop(int duongKinhDay, int chieuCao) {
		this.duongKinhDay = duongKinhDay;
		this.chieuCao = chieuCao;
	}

	public double TheTich() {
		double banKinh = duongKinhDay / 2;
		return (3.14 * banKinh * banKinh) * chieuCao;
	}
}
