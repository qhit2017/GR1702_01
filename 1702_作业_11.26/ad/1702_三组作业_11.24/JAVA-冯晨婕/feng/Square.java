/**
 * 
 */
package feng;
 
/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：26 Nov 2017 8:27:35 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Square implements Shape {
	//b.创建正方形，实现形状这个接口。
		//要求正方形具有的属性包括：边长、周长、面积（属性私有） ，
		//并创建两种构造方法（1 无参构造方法 2 参数为边长的构造方法）
	     private double  side;
	     private double girth;
	     private double area;

	 
	public Square() {
			super();
		}

 
	
	public Square(double side) {
		super();
		this.side = side;
	}



	@Override
	public void girth() {
		// TODO Auto-generated method stub
		System.out.println("4*边长");
	}

	 
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("边长*边长");
	}
	

}
