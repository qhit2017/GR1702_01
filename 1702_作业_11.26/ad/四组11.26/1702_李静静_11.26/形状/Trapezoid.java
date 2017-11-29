package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月26日 下午8:24:33 
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
		System.out.println("我是无参的");
	}

	public Trapezoid(int onlong, int inlong) {
		this.onlong = onlong;
		this.inlong = inlong;
	}

}
