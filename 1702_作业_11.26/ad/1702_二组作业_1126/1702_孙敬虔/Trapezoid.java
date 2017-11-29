package com.zk.sjq;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月26日 下午5:39:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid implements Form{
	double length1;
	double length2;
	double high;
	int  perimeter;
	private String areas;
	


	public String getAreas() {
		return areas;
	}

	@Override
	public int perimeter() {
		System.out.println("梯形周长是");
		return 25;
	}

	@Override
	public String areas() {
		System.out.println("梯形面积是");
		return "24";
	}
	
}
