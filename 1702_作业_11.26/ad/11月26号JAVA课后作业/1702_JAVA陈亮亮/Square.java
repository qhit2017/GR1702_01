package com.qk;
/**制作者：陈亮亮
 *制作时间：2017年11月26日下午8:37:21
 *邮箱：2507147605@qq.com
 */
public class Square  implements Form{
	private static double side;
	private double perimeter;
	private double area;

	

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
    public Square() {
		
	}
    public Square(double side) {
		super();
		this.side = side;
	}
	
      //创建正方形，实现形状这个接口。

	public static double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
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

	@Override
	public String toString() {
		return "Square [side=" + side + ", perimeter="
				+ perimeter + ", area=" + area + "]";
	}

	public String getHerelong() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
