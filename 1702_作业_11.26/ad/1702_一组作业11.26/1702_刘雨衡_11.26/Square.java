public class Square implements Ishape {
	double side;
	double perimeter;
	private double area;

	
	
   
	public Square() {
		System.out.println("我是正方形的无参构造方法");
	}

	
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side*4;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	

	

}
