package zhengxiangshun;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月25日 下午2:37:45 
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
		System.out.println("我是正方形周长");
		return a;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		System.out.println("我是正方形面积");
		return a;
	}

	

}
