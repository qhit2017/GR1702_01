
public class Trapezoid implements Shape {

	//属性：上边长、下边长、高、周长、面积
	private double upside;
	private double downside;
	private double high;
	private double  perimeter;
	private double area;
	
	
	
	
	//创建一个无参的构造方法；
	public Trapezoid() {
		System.out.println("我是Trapezoid类中的无参的构造方法！");
	}

	
	
	
	//创建一个参数为上边长，下边长的构造方法；

	public Trapezoid(double upside, double downside) {
		this.upside = upside;
		this.downside = downside;
	}

	
	
	
	//设置set,get

	public double getUpside() {
		return upside;
	}


	public void setUpside(double upside) {
		this.upside = upside;
	}


	public double getDownside() {
		return downside;
	}


	public void setDownside(double downside) {
		this.downside = downside;
	}


	public double getHigh() {
		return high;
	}


	public void setHigh(double high) {
		this.high = high;
	}


	public double getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	@Override
	public void perimeter() {
		System.out.println("我是梯形的周长，我也很长！");
		// TODO Auto-generated method stub

	}

	@Override
	public void area() {
		System.out.println("我是梯形的面积，我也很大！");
		// TODO Auto-generated method stub

	}

}
