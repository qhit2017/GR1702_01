package Tu;
/*
日期2017年11月26日时间上午11:51:39
邮箱：2408368509@qq.com
 */
public class Trapezoid implements Shape {

	double upSide;
	double lowerSide;
	double high;
	double a;
	double b;
	
	
	
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
		System.out.println();
	}

}
