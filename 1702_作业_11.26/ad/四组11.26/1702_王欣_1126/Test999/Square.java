package Test999;
/*制作人：王欣
 *制作时间：2017年11月26日下午8:31:41
 *邮箱：2408368509@qq.com
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
