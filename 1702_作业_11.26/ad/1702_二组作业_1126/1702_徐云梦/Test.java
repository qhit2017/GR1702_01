/**
 * 
 */

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��26�� ����4:16:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		//ʵ����������
		Square square = new Square();
		square.length=4;
		System.out.println("�߳���"+square.length);
		square.getPerimeter();
		System.out.println("�ܳ���"+square.getPerimeter());
		square.getArea();
		System.out.println("�����"+square.getArea());
		
		//ʵ��������
		Trapezoid trapezoid = new Trapezoid();
		trapezoid.shang=2;
		System.out.println("�ϵ���"+trapezoid.shang);
		trapezoid.xia=4;
		System.out.println("�µ���"+trapezoid.xia);
		trapezoid.zuo=3;
		System.out.println("��߳���"+trapezoid.zuo);
		trapezoid.you=3;
		System.out.println("�ұ߳���"+trapezoid.you);
		trapezoid.high=3;
		System.out.println("����"+trapezoid.high);
		trapezoid.getPerimeter();
		System.out.println("�ܳ���"+trapezoid.getPerimeter());
		trapezoid.getArea();
		System.out.println("�����"+trapezoid.getArea());
		
	}

}
