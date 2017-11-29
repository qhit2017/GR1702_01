package lijingjing;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月26日 下午8:18:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements Shape {
      private int length;
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

	public Square() {
		System.out.println("我是无参的");
	}

	public Square(int length) {
		this.length = length;
	}

}
