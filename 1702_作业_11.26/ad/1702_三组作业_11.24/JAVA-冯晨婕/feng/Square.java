/**
 * 
 */
package feng;
 
/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺26 Nov 2017 8:27:35 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Square implements Shape {
	//b.���������Σ�ʵ����״����ӿڡ�
		//Ҫ�������ξ��е����԰������߳����ܳ������������˽�У� ��
		//���������ֹ��췽����1 �޲ι��췽�� 2 ����Ϊ�߳��Ĺ��췽����
	     private double  side;
	     private double girth;
	     private double area;

	 
	public Square() {
			super();
		}

 
	
	public Square(double side) {
		super();
		this.side = side;
	}



	@Override
	public void girth() {
		// TODO Auto-generated method stub
		System.out.println("4*�߳�");
	}

	 
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("�߳�*�߳�");
	}
	

}
