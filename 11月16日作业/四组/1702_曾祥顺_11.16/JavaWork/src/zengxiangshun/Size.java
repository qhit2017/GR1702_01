package zengxiangshun;

import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��16�� ����8:45:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Size {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��1����");
		int a=sc.nextInt();
		System.out.println("��2����");
		int b=sc.nextInt();
		System.out.println("��3����");
		int c=sc.nextInt();
		System.out.println("��4����");
		int d=sc.nextInt();
		int l=0;
		if(a>b){
			l=a;
			a=b;
			b=l;
		}
		if (a>c) {
			l=a;
			a=c;
			c=l;
		}
		if (a>d) {
			l=a;
			a=d;
			d=l;
		}
		if (b>c) {
			l=b;
			b=c;
			c=l;	
		}
		if (b>d) {
			l=b;
			b=d;
			d=l;
		}
		if (c>d) {
			l=c;
			c=d;
			d=l;
		}
		
		System.out.println(d+"\t"+c+"\t"+b+"\t"+a);		
		}
		
		}



