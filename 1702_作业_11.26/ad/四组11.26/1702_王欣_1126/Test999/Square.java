package Test999;
/*�����ˣ�����
 *����ʱ�䣺2017��11��26������8:31:41
 *���䣺2408368509@qq.com
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
