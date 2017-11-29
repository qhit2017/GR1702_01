package shap02;

/* @author  作者：张庆  E-mail1738041626@QQ.com
 * @date    创建时间：2017年11月25日 上午10:42:17
 * @Tel: 1438438 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements Shap {

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void area() {
		// TODO Auto-generated method stub

	}

	private double side;
	private double perimeter;
	private double area;

	public Square() {

	}

	public Square(double side) {
		this.side = side;

	}

	public double getSide() {
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
}
