
public class Test {
	
	public static void main(String[] args) {
		Square s = new Square();
		s.side = 6;
		System.out.println(s.side);
		s.getArea();
		System.out.println("�����:"+s.getArea());
		s.getPerimeter();
		System.out.println("�ܳ���:"+s.getPerimeter());
		
		
		Trapezoid t = new Trapezoid();
		t.above = 4;
		System.out.println("�ϱ���:"+t.above);
		t.down = 6;
		System.out.println("�±���:"+t.down);
		t.left = 2.5;
		System.out.println("�����:"+t.left);
		t.right = 2.5;
		System.out.println("�ұ���:"+t.right);
		t.getArea();
		System.out.println("�����:"+t.getArea());
		t.getPerimeter();
		System.out.println("�ܳ���:"+t.getPerimeter());
	}

}
