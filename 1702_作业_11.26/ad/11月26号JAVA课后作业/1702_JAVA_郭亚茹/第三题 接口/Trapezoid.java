package Com.qq;

public class Trapezoid implements IShape {
	// �������Σ�ʵ����״����ӿڡ�Ҫ�����ξ��е����԰������ϱ߳����±߳����ߣ��ܳ������������˽�У�
	// ���������ֹ��췽����1�޲ι��췽�� 2 �����ϱ߳����±߳��Ĺ��췽����
	private double OnTheSaid; // �ϱ߳�
	private double HereLong; // �±߳�
	private double Hight; // ��
	private double permete; // �ܳ�
	private double area; // ���

	public double getOnTheSaid() {
		return 5;
	}

	public void setOnTheSaid(double onTheSaid) {
		OnTheSaid = onTheSaid;
	}

	public double getHereLong() {
		return 9;
	}

	public void setHereLong(double hereLong) {
		HereLong = hereLong;
	}

	public double getHight() {
		return 6;
	}

	public void setHight(double hight) {
		Hight = hight;
	}

	public double getPermete() {
		return 2;
	}

	public void setPermete(double permete) {
		this.permete = permete;
	}

	public double getArea() {
		return 5;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public Trapezoid() {
	}

	public Trapezoid(double onTheSaid, double hereLong) {
		OnTheSaid = onTheSaid;
		HereLong = hereLong;

	}

}
