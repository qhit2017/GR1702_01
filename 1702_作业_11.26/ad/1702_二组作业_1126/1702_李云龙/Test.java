package shape;

public class Test {
public static void main(String[] args) {
	//������
	Square square = new Square(6);
	System.out.println("�����ε��ܳ��ǣ�"+square.perimeter());
	System.out.println("�����ε�����ǣ�"+square.area());
	
	
	//����
	Trapezoid t = new Trapezoid(4,6);
	t.y=5;
	t.g=2;
	
	System.out.println("���"+t.area());
	System.out.println("�ܳ�"+t.perimeter());
	
}
}
