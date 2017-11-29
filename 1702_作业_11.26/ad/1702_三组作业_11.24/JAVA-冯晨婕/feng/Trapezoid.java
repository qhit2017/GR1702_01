/**
 * 
 */
package feng;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：26 Nov 2017 8:40:57 Ntambama
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
public class Trapezoid implements Shape{
	//c.创建梯形，实现形状这个接口。要求梯形具有的属性包括：上边上、下边长、高、周长、面积（属性私有） ，
	//并创建两种构造方法（1 无参构造方法
	//2 参数为上边长、下边长的构造方法）
	 private double  shangside; 
	 private double  xiaside;
	 private double tall;
     private double girth;
     private double area;
	
	 
	 
	public Trapezoid() {
		super();
	}

	
	
	
	
	public Trapezoid(double shangside, double xiaside) {
		super();
		this.shangside = shangside;
		this.xiaside = xiaside;
	}





	@Override
	public void girth() {
		// TODO Auto-generated method stub
		System.out.println("边长相加");
	}

	/* (non-Javadoc)
	 * @see feng.Shape#area()
	 */
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("上底+下底*高除2");
	}

}
