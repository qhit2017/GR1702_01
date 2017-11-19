package lishaoqing;

import java.util.Scanner;

public class Work_5 {
public static void main(String[] args) {
	Scanner e = new Scanner(System.in);
	System.out.println("请输入第几次");
	double h=100;
	double a = e.nextDouble();
	
	if(a==1){
		System.out.println(h);
	}
	for(int b=2;b<=10000;b++){
		h=h/2;
		if(b==a){
			System.out.println(h);
			break;
		}
		
	}
	
}
}
