package zhengxiangshun;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月25日 下午2:41:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid implements Shape{
	private double a1;
	private double b1;
	private double c1;
	private double d1;
	private double e1;
	
	public Trapezoid() {
	}

	public Trapezoid(double a1, double b1) {
		this.a1 = a1;
		this.b1 = b1;
	}

	@Override
	public double perimeter() {
		System.out.println("我是梯形周长");
		return a1;
		// TODO Auto-generated method stub
		
	}

	@Override
	public double area() {
		System.out.println("我是梯形面积");
		return a1;
		// TODO Auto-generated method stub
		
	}

}
