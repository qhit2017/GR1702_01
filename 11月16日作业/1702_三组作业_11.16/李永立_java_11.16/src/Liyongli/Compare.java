package Liyongli;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月16日 下午8:46:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Compare {
public static void main(String[] args) {
	//从键盘接受4个值
	Scanner m = new Scanner(System.in);
	System.out.println("请输入第一个数："); 
	int a = m.nextInt();
	System.out.println("请输入第二个数：");
	int b = m.nextInt();
	System.out.println("请输入第三个数：");
	int c = m.nextInt();
	System.out.println("请输入第四个数：");
	int d = m.nextInt();
	int n;
		
	//比较
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
	System.out.println("这4 个整数从大到小的顺序排列输出为：");
	System.out.println(a+"\t"+b+"\t"+c+"\t"+d);
}
}
