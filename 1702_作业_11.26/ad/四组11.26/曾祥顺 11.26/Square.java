package zhengxiangshun;
/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��25�� ����2:37:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements Shape {
	private double a;
	private double b;
	private double c;

	public Square() {
	}

	public Square(double a) {
		this.a = a;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		System.out.println("�����������ܳ�");
		return a;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		System.out.println("�������������");
		return a;
	}

	

}
