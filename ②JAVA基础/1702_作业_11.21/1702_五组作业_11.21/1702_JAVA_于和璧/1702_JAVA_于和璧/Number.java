package Test4;

import java.util.Scanner;
  //回文数
public class Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个五位数：");
		
		int a = sc.nextInt();
		if(a/10000==a%10 && a%10000/1000==a%100/10){
			
			System.out.println(a+"是回文数");
		}else{
			
			System.out.println(a+"不是回文数");
		}
		sc.close();
	}
}
