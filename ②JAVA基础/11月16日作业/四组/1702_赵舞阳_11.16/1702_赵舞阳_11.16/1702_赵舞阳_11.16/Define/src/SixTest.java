import java.util.Scanner;

//�Ӽ�������4����������д����ʵ�ֶ���4 �������Ӵ�С��˳�����������
public class SixTest {
public static void main(String[] args) {
	System.out.println("������:");
	Scanner sc = new Scanner(System.in);
	System.out.println("�������1����:");
	int a =sc.nextInt();
	System.out.println("�������2����:");
	int b =sc.nextInt();
	System.out.println("�������3����:");
	int c =sc.nextInt();
	System.out.println("�������4����:");
	int d =sc.nextInt();
	int e;
	if(a>b){
		e=a;
		a=b;
		b=e;
	}
	if(a>c){
		e=a;
		a=c;
		c=e;
	}
	if(a>d){
		e=a;
		a=d;
		d=e;
	}
	if(b>c){
		e=b;
		b=c;
		c=e;
	}
	if(b>d){
		e=b;
		b=d;
		d=e;
	}
	if(c>d){
		e=c;
		c=d;
		d=e;
	}
	System.out.println("�Ӵ�С��˳���������:"+d+">"+c+">"+b+">"+a);
	sc.close();
}
}
