package Rank;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月16日 上午8:44:46 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Rank {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("输入第一个数：");
		int a =sc.nextInt();
		System.out.println("输入的第一个数为："+a);
		System.out.println("输入第二个数：");
		int b =sc.nextInt();
		System.out.println("输入的第二个数为："+b);
		System.out.println("输入第三个数：");
		int c =sc.nextInt();
		System.out.println("输入的第三个数为"+c);
		System.out.println("输入第四个数：");
		int d=sc.nextInt();
		System.out.println("输入的第四个数为"+d);
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
		



