/**
 * 
 */
package feng;
import java.util.Scanner;

/**
 * @author ���ߣ��볿�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺26 Nov 2017 8:40:57 Ntambama
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
public class Trapezoid implements Shape{
	//c.�������Σ�ʵ����״����ӿڡ�Ҫ�����ξ��е����԰������ϱ��ϡ��±߳����ߡ��ܳ������������˽�У� ��
	//���������ֹ��췽����1 �޲ι��췽��
	//2 ����Ϊ�ϱ߳����±߳��Ĺ��췽����
	 private double  shangside; 
	 private double  xiaside;
	 private double tall;
     private double girth;
     private double area;
	
	 
	 
	public Trapezoid() {
		super();
	}

	
	
	
	
	public Trapezoid(double shangside, double xiaside) {
		super();
		this.shangside = shangside;
		this.xiaside = xiaside;
	}





	@Override
	public void girth() {
		// TODO Auto-generated method stub
		System.out.println("�߳����");
	}

	/* (non-Javadoc)
	 * @see feng.Shape#area()
	 */
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("�ϵ�+�µ�*�߳�2");
	}

}
