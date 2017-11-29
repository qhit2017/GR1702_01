package xiaxiaoyu;

public class Square {
	double perimeter;
	double side;
	private double area;

	public Square() {

	}

	public Square(double side) {

		this.side = side;
	}

	public Square(int side2) {
		// TODO Auto-generated constructor stub
	}

	public double perimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}

	public double area() {
		// TODO Auto-generated method stub
		return side*side;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
}
