package shape;

public class Trapezoid implements Shape{
//梯形
	int s;//上边长
	int x;//下边长
	int g;//高
	private int m;//面积
	int z;//周长
	int y;//腰
	
	
	
	
	public int getM() {
		return m;
	}

	public int perimeter() {
		z=s+x+(z*2);
		return z;
	}

	public int area() {
		m=((s+x)*g)/2;
		return getM();
	}
 

public Trapezoid(){
	
	
}

public Trapezoid(int s, int x) {
	
	this.s = s;
	this.x = x;
}



}
