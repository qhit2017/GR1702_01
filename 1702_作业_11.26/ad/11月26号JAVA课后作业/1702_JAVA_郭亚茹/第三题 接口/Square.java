package Com.qq;

public class Square implements IShape {
	// 创建正方形，实现形状这个接口。要求正方形具有的属性包括边长，周长，面积（属性私有）
	// 并创建两种构造方法（1无参构造方法 2 有参构造方法）
	private double side; // 边长
	private double permete; // 周长
	private double area; // 面积

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
