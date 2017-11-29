package shape;

public class Test {
public static void main(String[] args) {
	//正方形
	Square square = new Square(6);
	System.out.println("正方形的周长是："+square.perimeter());
	System.out.println("正方形的面积是："+square.area());
	
	
	//梯形
	Trapezoid t = new Trapezoid(4,6);
	t.y=5;
	t.g=2;
	
	System.out.println("面积"+t.area());
	System.out.println("周长"+t.perimeter());
	
}
}
