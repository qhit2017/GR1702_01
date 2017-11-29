/**
 * 
 */

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月26日 下午3:59:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements Shape{
	
	//属性
	double length;//边长
	double perimeter;//周长
	private double area;//面积
	
	
	
	//无参的构造方法

	public Square() {
		super();
	}
	//参数为边长的构造方法
	
	public Square(double length) {
		super();
		this.length = length;
	}

	/* (non-Javadoc)
	 * @see Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return length*4;
	}

	/* (non-Javadoc)
	 * @see Shape#getArea()
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*length;
	}

	
	

}
