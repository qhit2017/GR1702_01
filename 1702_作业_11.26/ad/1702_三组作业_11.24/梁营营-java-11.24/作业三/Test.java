
public class Test {

	 public static void main(String[] args) {
		//�ֱ𴴽������κ����ε�ʵ�������󣬸���������Ը�ֵ�����ҵ��ö�����ܳ�������ķ���
		 //���������ε�ʵ��������
		 Square square = new Square();
		 square.setSide(4);
		 square.setPerimeter(16);
		 square.setArea(16);
		 System.out.println("�߳���"+square.getSide());
		 System.out.println("�ܳ���"+square.getPerimeter());
		 System.out.println("�����"+square.getArea());
		 square.perimeter();
		 square.area();
		 
		 //�������ε�ʵ��������
		 Trapezoid trapezoid = new Trapezoid();
		 trapezoid.setUpside(6);
		 trapezoid.setDownside(12);
		 trapezoid.setHigh(8);
		 trapezoid.setPerimeter(32);
		 trapezoid.setArea(72);
		 System.out.println("�ϱ߳���"+trapezoid.getUpside());
		 System.out.println("�±߳���"+trapezoid.getDownside());
		 System.out.println("�߶ȣ�"+trapezoid.getHigh());
		 System.out.println("�ܳ���"+trapezoid.getPerimeter());
		 System.out.println("�����"+trapezoid.getArea());
		 trapezoid.perimeter();
		 trapezoid.area();
	}
}
