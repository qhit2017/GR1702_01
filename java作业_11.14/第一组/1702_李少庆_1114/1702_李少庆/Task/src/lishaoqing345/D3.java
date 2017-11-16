package lishaoqing345;

import java.util.Scanner;

public class D3 {
public static void main(String[] args) {
	Scanner w = new Scanner(System.in);
	System.out.println("请输入你的成绩");
	int a = w.nextInt();
	if(a>=90){
		System.out.println("您的等级为：A");
	}else if(a>=60){
		System.out.println("您的等级为：B");
	}else{
		System.out.println("您的等级为：C");
	}
}
	
}
