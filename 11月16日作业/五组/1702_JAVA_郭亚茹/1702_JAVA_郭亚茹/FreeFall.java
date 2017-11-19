package guo;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:2379675496@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class FreeFall {
	public static void main(String[] args) {
		//  一球从h米高度自由落下，每次落地后反跳回原高度的一半；
	    //   再落下，求它在 第n次落地时，共经过多少米？第n次反弹多高？
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入起始的高度:a=");
    	int a=sc.nextInt();
    	System.out.println("请输入反弹的次数：b=");
    	int b=sc.nextInt();
    	int c=0;
    	double t=1;
	
   do{
	   t=t/2;
	   
       b--;
       c++;
  }while(b>1);
   t=a*t/2;
   c=c+1;
   System.out.println("球一共反弹了"+c+"次,它现在的高度是："+t);
} 
}