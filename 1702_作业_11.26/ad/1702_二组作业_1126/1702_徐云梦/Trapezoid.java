/**
 * 
 */

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��26�� ����4:07:31 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Trapezoid implements Shape{
	
	//����
	double shang;//�ϱ߳�
	double xia;//�±߳�
	double zuo;//��߳�
	double you;//�ұ߳�
	double high;//��
	double perimeter;//�ܳ�
	private double area;//���
	

	 //�޲εĹ��췽��

	public Trapezoid() {
		super();
	}
	//����Ϊ�ϱ߳����±߳��Ĺ��췽��

	public Trapezoid(double shang, double xia) {
		super();
		this.shang = shang;
		this.xia = xia;
	}
	/* (non-Javadoc)
	 * @see Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return shang+xia+zuo+you;
	}
	/* (non-Javadoc)
	 * @see Shape#getArea()
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (shang+xia)*high/2;
	}
	
	
	
	

}
