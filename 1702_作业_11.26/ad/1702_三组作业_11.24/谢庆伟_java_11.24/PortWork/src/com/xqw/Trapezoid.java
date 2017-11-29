package com.xqw;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月26日 下午4:48:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid implements IShape{

	private double uplen;  //上底
	private double downlen;  //下底
	private double high;  //高
	private double leftlen;  //左腰
	private double rightlen;  //右腰
	private double perimeter;  //周长
	private double area;  //面积
	
	public Trapezoid() {
	}
	

	public Trapezoid(double uplen, double downlen) {
		this.uplen = uplen;
		this.downlen = downlen;
	}


	@Override
	public void GetPerimeter() {
		perimeter=uplen+downlen+leftlen+rightlen;
		System.out.println("此梯形的周长是"+perimeter);
		
	}

	@Override
	public void GetArea() {
		area=(uplen+downlen)*high/2;
		System.out.println("此梯形的面积是"+area);
		
	}


	public double getHigh() {
		return high;
	}


	public void setHigh(double high) {
		this.high = high;
	}


	public double getLeftlen() {
		return leftlen;
	}


	public void setLeftlen(double leftlen) {
		this.leftlen = leftlen;
	}


	public double getRightlen() {
		return rightlen;
	}


	public void setRightlen(double rightlen) {
		this.rightlen = rightlen;
	}
	

}
