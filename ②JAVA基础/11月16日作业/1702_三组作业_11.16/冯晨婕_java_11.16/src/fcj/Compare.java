/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author ���ߣ�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺16 Nov 2017 8:27:03 Ntambama
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
public class Compare {
//�Ӽ�������4��������
	//��д����ʵ�ֶ���4 �������Ӵ�С��˳�����������
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("�������һ����");
		int a =sc.nextInt();
		System.out.println("������ڶ�����");
		int b =sc.nextInt();
		System.out.println("�������������");
		int c =sc.nextInt();
		System.out.println("��������ĸ���");
		int d =sc.nextInt();
		int m=0;
		if(a>b){
		 m=a;
		a=b;
		b=m;}
		if(a>c){
			m=a;
			a=c;
			c=m;}
				if(a>d){
					m=a;
					a=d;
					d=m;}
				
	
	if(b>c){
	m=b;
	b=c;
	c=m;}
	
	if(b>d){
		m=b;
		b=d;
		d=m;}
		 if(c>d){
			 m=c;
			 c=d;
			 d=m;
		 }
		 
		
		
		
	
	
	System.out.println(d+"\t"+c+"\t"+b+"\t"+a);
	
	
	
	
	
	
}
}