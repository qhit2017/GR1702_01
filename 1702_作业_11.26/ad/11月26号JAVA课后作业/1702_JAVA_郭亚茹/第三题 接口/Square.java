package Com.qq;

public class Square implements IShape {
	// ���������Σ�ʵ����״����ӿڡ�Ҫ�������ξ��е����԰����߳����ܳ������������˽�У�
	// ���������ֹ��췽����1�޲ι��췽�� 2 �вι��췽����
	private double side; // �߳�
	private double permete; // �ܳ�
	private double area; // ���

	public double getSide() {
		return 7;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getPermete() {
		return 4;
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

	public Square() {

	}

	public Square(double side, double permete, double area) {
		this.side = side;
		this.permete = permete;
		this.area = area;
	}

}
