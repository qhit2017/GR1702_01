package KaoShi;

import java.util.Scanner;

/*
����2017��11��26��ʱ������12:58:56
���䣺2408368509@qq.com
 */
public class D04 {
public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	System.out.println("������һ������");
	int a = x.nextInt();
	
	if (a>=90) {
		System.out.println("A");
	}else if (a>=60){
		System.out.println("B");
	}else{
		System.out.println("C");
	}
}
}
