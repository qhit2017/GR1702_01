package fcj;

import java.util.Scanner;

public class Sceond {
public static void main(String[] args) {
	//输入两个小数；比较大小输出判断结果；
	Scanner c =new Scanner (System.in);
	System.out.println("请输入第一个数：");
	double a = c.nextDouble();
	Scanner s  =new Scanner (System.in);
	System.out.println("请输入第二个数：");
	double b = s .nextDouble();
	if(a>b){
		System.out.println(a+"大于"+b);}
  else{ if(a<b){
	  System.out.println(a+"小于"+b);
  }else{if(a==b){
	  System.out.println(a+"等于"+b);}
	
	
	
	
	
	
	
	
  }	
}
}
}