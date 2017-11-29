package com.xqw;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月26日 下午4:34:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements IShape{

	private double length;  //边长
	private double perimeter;  //周长
	private double area;  //面积
	
	public Square() {
	}
	
	public Square(double length) {
		this.length = length;
	}

	@Override
	public void GetPerimeter() {
		perimeter=length*4;
		System.out.println("边长为"+length+"的正方形的周长是"+perimeter);
		
	}
	@Override
	public void GetArea() {
		area=Math.pow(length, 2);
		System.out.println("边长为"+length+"的正方形的面积是"+area);
		
	}
	

}
