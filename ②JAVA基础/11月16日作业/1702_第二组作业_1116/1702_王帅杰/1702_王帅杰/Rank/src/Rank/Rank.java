package Rank;

import java.util.Scanner;

/** 
 * @author  ���� E-mail:738348954@qq.com
 * @date    ����ʱ�䣺2017��11��16�� ����8:44:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Rank {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("�����һ������");
		int a =sc.nextInt();
		System.out.println("����ĵ�һ����Ϊ��"+a);
		System.out.println("����ڶ�������");
		int b =sc.nextInt();
		System.out.println("����ĵڶ�����Ϊ��"+b);
		System.out.println("�������������");
		int c =sc.nextInt();
		System.out.println("����ĵ�������Ϊ"+c);
		System.out.println("������ĸ�����");
		int d=sc.nextInt();
		System.out.println("����ĵ��ĸ���Ϊ"+d);
		int t ;
		if(a<b)  
			  {  
			   t=a;  
			   a=b;  
			   b=t;  
			  }  
			 if(a<c)  
			  {  
			   t=a;  
			   a=c;  
			   c=t;  
			  }  
			 if(a<d)  
			  {  
			   t=a;  
			   a=d;  
			   d=t;  
			  }  
			 if(b<c)  
			  {  
			  t=b;  
			   b=c;  
			   c=t;  
			  }  
			 if(b<d)  
			  {  
			   t=b;  
			   b=d;  
			   d=t;  
			  }  
			 if(c<d)  
			  {  
			   t=c;  
			   c=d;  
			   d=t;  
			   System.out.println(a+""+b+""+c+""+d);
		sc.close();
		
		
		
		
	}
	
	
	
	
	}
	}
		



