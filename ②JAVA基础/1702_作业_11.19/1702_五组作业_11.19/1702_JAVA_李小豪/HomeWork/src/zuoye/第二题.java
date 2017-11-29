package zuoye;

import java.util.Scanner;

/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class 第二题 {
public static void main(String[] args) {
	
	//通过控制台输入两个小数,判断两个小数大小,并输出判断结果
	Scanner sc =new Scanner(System.in);
	System.out.println("请输入两个小数:");
	double a =sc.nextDouble();
	double b =sc.nextDouble();
	boolean c =true;
	if(a>b){
		System.out.println("true");
		System.out.println("a>b的判断结果为:"+c);
	}else if(a<b){
		boolean d =false;
		System.out.println("false");
		System.out.println("a<b的判断结果为:"+d);
	}
	
	System.out.println();
	
}

}



