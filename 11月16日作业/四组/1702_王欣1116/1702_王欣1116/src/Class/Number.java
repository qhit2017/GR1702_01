package Class;

import java.util.Scanner;

/*�����ˣ�����
 *����ʱ�䣺2017��11��16������9:57:35
 *���䣺2408368509@qq.com
 */

public class Number {
	//�Ӽ�������4��������
	//��д����ʵ�ֶ���4 �������Ӵ�С��˳�����������
	public static void main(String[] args) {
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
		if(a<b){
			n=a;
			a=b;
			b=n;
		}
		if(a<c){
			n=c;
			c=a;
			a=n;
		}
		if(a<d){
			n=d;
			d=a;
			a=n;
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
		System.out.println("�����4 �������Ӵ�С��˳��Ϊ��");
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
		
	}

}
