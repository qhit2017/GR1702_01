/**
 * 
 */

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月26日 下午4:07:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid implements Shape{
	
	//属性
	double shang;//上边长
	double xia;//下边长
	double zuo;//左边长
	double you;//右边长
	double high;//高
	double perimeter;//周长
	private double area;//面积
	

	 //无参的构造方法

	public Trapezoid() {
		super();
	}
	//参数为上边长、下边长的构造方法

	public Trapezoid(double shang, double xia) {
		super();
		this.shang = shang;
		this.xia = xia;
	}
	/* (non-Javadoc)
	 * @see Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return shang+xia+zuo+you;
	}
	/* (non-Javadoc)
	 * @see Shape#getArea()
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (shang+xia)*high/2;
	}
	
	
	
	

}
