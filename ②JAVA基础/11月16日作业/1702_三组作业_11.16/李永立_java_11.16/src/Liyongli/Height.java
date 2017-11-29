package Liyongli;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月16日 上午9:41:51 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Height {
	public static void main(String[] args) {
		
	
	//一球从100米高度自由落下，每次落地后反跳回原高度的一半；
    //再落下，求它在 第5次落地时，共经过多少米？第5次反弹多高？     
	double h=100;
	double n=h/2;
	for (int t=1;t<5; t++ ){
		h+=n*2;
		n=n/2;
		
	}
	System.out.println("从100米高自由落下反弹5次共经过了"+h+"米");
	System.out.println("输出第五次的反跳的高度为："+n+"米");
	
	
	
		
	}
	
	
}
