package shap02;

/* @author  作者：张庆  E-mail1738041626@QQ.com
 * @date    创建时间：2017年11月25日 上午10:54:35
 * @Tel: 1438438 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid implements Shap {

	@Override
	public void perimeter() {
		// TODO Auto-generated method stub

	}

	@Override
	public void area() {
		// TODO Auto-generated method stub

	}

	private double ontheside;
	private double herelong;
	private double tell;
	private double perimeter;
	private double area;

	public Trapezoid() {

	}

	public Trapezoid(double ontheside, double herelong) {
		this.ontheside = ontheside;
		this.herelong = herelong;

	}

	public double getOntheside() {
		return ontheside;
	}

	public void setOntheside(double ontheside) {
		this.ontheside = ontheside;
	}

	public double getHerelong() {
		return herelong;
	}

	public void setHerelong(double herelong) {
		this.herelong = herelong;
	}

	public double getTell() {
		return tell;
	}

	public void setTell(double tell) {
		this.tell = tell;
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
