package Test999;
/*�����ˣ�����
 *����ʱ�䣺2017��11��26������8:33:45
 *���䣺2408368509@qq.com
 */

public class Trapezoid implements Shape {

	double upSide;
	double lowerSide;
	double high;
	
	
	public Trapezoid() {
		super();
	}

	public Trapezoid(double upSide, double lowerSide) {
		super();
		this.upSide = upSide;
		this.lowerSide = lowerSide;
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println((upSide+lowerSide)*high/2);
	}

	@Override
	public void Perimeter() {
		// TODO Auto-generated method stub

	}

}
