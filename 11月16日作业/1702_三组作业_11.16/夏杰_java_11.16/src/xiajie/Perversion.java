package xiajie;

import java.util.Scanner;

public class Perversion {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������һ������");
		int a = sc.nextInt(); 
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		System.out.println("���������������");
		int c = sc.nextInt();
		System.out.println("��������ĸ�����");
		int d = sc.nextInt();
		int t;
		//6892
		if(a<b) {
			t=a;
			a=b;
			b=t;
			}
		if(a<c) {
			t=a;
			a=c;
			c=t;
			}
		if(a<d) {
			t=a;
			a=d;
			d=t;
			}
		if(b<c) {
			t=b;
			b=c;
			c=t;
			}
		if(b<d) {
			t=b;
			b=d;
			d=t;
			}
		if(c<d) {
			t=c;
			c=d;
			d=t;
			}
		
		
		
		
		
		
		
		System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
		}	
	}


