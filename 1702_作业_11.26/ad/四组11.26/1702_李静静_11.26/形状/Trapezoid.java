package lijingjing;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��26�� ����8:24:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid implements Shape {
private int onlong ;
private int inlong;
private int  tall ;
private int perimeter;
private int area;
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void area() {
		// TODO Auto-generated method stub

	}

	public Trapezoid() {
		System.out.println("�����޲ε�");
	}

	public Trapezoid(int onlong, int inlong) {
		this.onlong = onlong;
		this.inlong = inlong;
	}

}
