
package com.Form;
/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月25日 下午1:26:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements Form {

	double side;
	double perimeter;
	private double area;
	
	Square() {
		System.out.println("我是Square的无参构造方法");
	}
	
	public Square(double side) {
		this.side = side;
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return side*4;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

}
