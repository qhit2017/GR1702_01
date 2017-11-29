package com.qhit.wyk;
/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月24日 下午1:28:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid implements IForm{

	//创建梯形，实现形状这个接口。要求梯形具有的属性包括：上边上、下边长、高、周长、面积（属性私有） ，
	//并创建两种构造方法（1 无参构造方法 2 参数为上边长、下边长的构造方法）
	private double UpperCupLength;
	private double HereLong;
	private double tall;
	private double perimeter;
	private double area;
	public Trapezoid() {
		
	}
	
	@Override
	public String toString() {
		return "Trapezoid []";
	}


	public Trapezoid(double upperCupLength, double hereLong) {
		UpperCupLength = upperCupLength;
		HereLong = hereLong;
	}


	public double getUpperCupLength() {
		return UpperCupLength;
	}


	public void setUpperCupLength(double upperCupLength) {
		UpperCupLength = upperCupLength;
	}


	public double getHereLong() {
		return HereLong;
	}


	public void setHereLong(double hereLong) {
		HereLong = hereLong;
	}


	public double getTall() {
		return tall;
	}


	public void setTall(double tall) {
		this.tall = tall;
	}


	public double getPerimeter() {
		return perimeter;
	}


	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}
	
	
	
	
	


	
	
	
	
	
	
	
}
