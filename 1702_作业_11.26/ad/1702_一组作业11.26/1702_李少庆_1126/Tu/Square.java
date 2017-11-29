package Tu;
/*
日期2017年11月26日时间上午11:47:01
邮箱：2408368509@qq.com
 */
public class Square implements Shape {

	private double side;
	
	
	public Square() {
		super();
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(side*side);
	}

	@Override
	public void Perimeter() {
		// TODO Auto-generated method stub
		System.out.println(side*4);
	}

	
}
