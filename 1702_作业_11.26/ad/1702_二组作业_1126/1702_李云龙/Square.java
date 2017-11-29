package shape;

public class Square implements Shape {
//正方形
	private int a;//面积
	 int b;//边长
	 int c;//周长
	
	public int perimeter() {
		c=b*4;
		return c;
	}
	
	
	public int getA() {
		return a;
	}

	
	public int area() {
		a=b*b;
		return getA();
	}
	public Square() {
	
	}
	public Square(int b) {
		
		this.b = b;
	}
	
}
