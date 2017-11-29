package com.qk;
/**制作者：陈亮亮
 *制作时间：2017年11月26日下午8:42:10
 *邮箱：2507147605@qq.com
 */
public class Trapezoid implements Form {
	 //创建梯形，实现形状这个接口。要求梯形具有的属性包括：上边上、下边长、高、周长、面积（属性私有）
		//并创建两种构造方法（1 无参构造方法 2 参数为上边长、下边长的构造方法）
	private double Uppercuplength;
	private double Herelong;
	private double tall;
	private double perimeter;
	private double  area;
	
	public Trapezoid() {
		
	}
	
	public Trapezoid(double uppercuplength, double herelong) {
		super();
		Uppercuplength = uppercuplength;
		Herelong = herelong;
	}

	
	
	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}

	

	public double getUppercuplength() {
		return Uppercuplength;
	}

	public void setUppercuplength(double uppercuplength) {
		Uppercuplength = uppercuplength;
	}

	public double getHerelong() {
		return Herelong;
	}

	public void setHerelong(double herelong) {
		Herelong = herelong;
	}

	public double getTall() {
		return tall;
	}

	public void setTall(double tall) {
		this.tall = tall;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		return "Trapezoid [Uppercuplength=" + Uppercuplength + ", Herelong="
				+ Herelong + ", tall=" + tall + ", perimeter=" + perimeter
				+ "]";
	}

}

