package shape;

public class Square implements Shape {
//������
	private int a;//���
	 int b;//�߳�
	 int c;//�ܳ�
	
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
