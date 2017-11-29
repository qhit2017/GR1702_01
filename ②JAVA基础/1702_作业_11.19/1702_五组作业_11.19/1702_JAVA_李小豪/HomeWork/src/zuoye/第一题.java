package zuoye;

import java.util.Scanner;

/**
 * time:11.16
 *week:Thursday
 *weather:sun
 *author:sun 
 * site:machine room
 */
public class 第一题 {
public static void main(String[] args) {
	
	//通过控制台输入一个数字，判断该数字是正数还是负数,并输出结果
	
	Scanner sc = new Scanner(System.in);
	System.out.println("请输出:");
	int a =sc.nextInt();
	if(a>0){
		System.out.println("该数为正数");
	}else if(a<0){
		System.out.println("该数为负数");
	}else{
		System.out.println("该数不为正数，也不为负数");
	}
	System.out.println();
	
}

}



