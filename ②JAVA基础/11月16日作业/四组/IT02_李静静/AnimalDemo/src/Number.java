import java.util.Scanner;

 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��16�� ����9:03:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Number {
	/*�Ӽ�������4����������д����ʵ�ֶ���4 
	 * �������Ӵ�С��˳�����������
	 */
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("�������һ����");
	int a = sc.nextInt();
	System.out.println("������ڶ�����");
	int b = sc.nextInt();
	System.out.println("�������������");
	int c = sc.nextInt();
	System.out.println("��������ĸ���");
	int d = sc.nextInt();
	int g ;
	if(a>b){
		g=a;
		a=b;
		b=g;		
	}
	if(a>c){
		g=a;
		a=c;
		c=g;
	}
	if(a>d){
		g=a;
		a=d;
		d=g;
	}
	if(b>c){
		g=b;
		b=c;
		c=g;
	}
	if(b>d){
		g=b;
		b=d;
		d=g;
	}
	if(c>d){
		g=c;
		c=d;
		d=g;
	}
	System.out.println(d+">"+c+">"+b+">"+a);
	
	
	
	
	
	
}
}
