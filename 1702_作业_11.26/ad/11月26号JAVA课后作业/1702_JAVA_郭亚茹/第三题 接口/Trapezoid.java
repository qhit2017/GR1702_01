package Com.qq;

public class Trapezoid implements IShape {
	// 创建梯形，实现形状这个接口。要求梯形具有的属性包括：上边长，下边长，高，周长，面积（属性私有）
	// 并创建两种构造方法（1无参构造方法 2 参数上边长，下边长的构造方法）
	private double OnTheSaid; // 上边长
	private double HereLong; // 下边长
	private double Hight; // 高
	private double permete; // 周长
	private double area; // 面积

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
