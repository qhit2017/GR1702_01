
public  class Square implements Shape {

	//属性：边长、周长、面积
	private double side;
	private double perimeter;
	private double area;
	
	
	//创建一个无参的构造方法；
	public Square() {
		System.out.println("我是Square类中的无参的构造方法！");
	}

	
	//创建参数为边长的构造方法；
	public Square(double side) {
		this.side = side;
	}
	
	
	//设置set,get
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
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
		System.out.println("我是正方形的周长，我很长！");
		// TODO Auto-generated method stub

	}

	@Override
	public void area() {
		System.out.println("我是正方形的面积，我很大！");
		// TODO Auto-generated method stub

	}

}
