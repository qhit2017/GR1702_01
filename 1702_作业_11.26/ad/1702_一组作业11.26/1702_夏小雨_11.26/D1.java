package xiaxiaoyu;

import java.util.Scanner;

public class D1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("输入两个小数");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	if(a==b){
		System.out.println("两数相等");
}
	if (a!=b) {
		System.out.println("两数不相等");
	}
}
}
