/**
 * 
 */

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��26�� ����3:59:14 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements Shape{
	
	//����
	double length;//�߳�
	double perimeter;//�ܳ�
	private double area;//���
	
	
	
	//�޲εĹ��췽��

	public Square() {
		super();
	}
	//����Ϊ�߳��Ĺ��췽��
	
	public Square(double length) {
		super();
		this.length = length;
	}

	/* (non-Javadoc)
	 * @see Shape#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return length*4;
	}

	/* (non-Javadoc)
	 * @see Shape#getArea()
	 */
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length*length;
	}

	
	

}
