public class Trapezoid implements Ishape {
	double above;
	double down;
	double left;
	double right;
	double high;
	double perimeter;
	private double area;

	// 无参构造方法
	public Trapezoid() {
		System.out.println("我是梯形的无参构造方法");
	}

	// 参数为上边长、下边长的构造方法
	public Trapezoid(double above, double down) {
		this.above = above;
		this.down = down;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return above + down + left + right;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (above + down) * high / 2;
	}

}
