package Liyongli;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��11��16�� ����8:46:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Compare {
public static void main(String[] args) {
	//�Ӽ��̽���4��ֵ
	Scanner m = new Scanner(System.in);
	System.out.println("�������һ������"); 
	int a = m.nextInt();
	System.out.println("������ڶ�������");
	int b = m.nextInt();
	System.out.println("���������������");
	int c = m.nextInt();
	System.out.println("��������ĸ�����");
	int d = m.nextInt();
	int n;
		
	//�Ƚ�
	if(a<b){
		n=a;
		a=b;
		b=n;
	}
	if(a<c){
		n=a;
		a=c;
		c=n;
		
	}
	if(a<d){
		n=a;
		a=d;
		d=n;
	}
	if(b<c){
		n=b;
		b=c;
		c=n;
	}
	if(b<d){
		n=b;
		b=d;
		d=n;
	}
	if(c<d){
		n=c;
		c=d;
		d=n;
	}
	System.out.println("��4 �������Ӵ�С��˳���������Ϊ��");
	System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
}
}
