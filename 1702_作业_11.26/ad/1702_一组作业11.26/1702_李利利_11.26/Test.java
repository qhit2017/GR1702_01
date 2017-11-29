
public class Test {
	
	public static void main(String[] args) {
		Square s = new Square();
		s.side = 6;
		System.out.println(s.side);
		s.getArea();
		System.out.println("面积是:"+s.getArea());
		s.getPerimeter();
		System.out.println("周长是:"+s.getPerimeter());
		
		
		Trapezoid t = new Trapezoid();
		t.above = 4;
		System.out.println("上边是:"+t.above);
		t.down = 6;
		System.out.println("下边是:"+t.down);
		t.left = 2.5;
		System.out.println("左边是:"+t.left);
		t.right = 2.5;
		System.out.println("右边是:"+t.right);
		t.getArea();
		System.out.println("面积是:"+t.getArea());
		t.getPerimeter();
		System.out.println("周长是:"+t.getPerimeter());
	}

}
