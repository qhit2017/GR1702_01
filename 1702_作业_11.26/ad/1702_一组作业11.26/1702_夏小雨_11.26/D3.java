package xiaxiaoyu;

import java.util.Scanner;

public class D3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入一个不超过10000的数");
	int N = sc.nextInt();
	if (N<=10000) {
		if (N/10000==1) {
			System.out.println("该数是5位数");
		} else if(N/1000==1){
System.out.println("该数是4位数");
		}else if (N/100==1) {
			System.out.println("该数是3位数");
		}
		else if (N/10==1) {
			System.out.println("该数是2位数");
		}
		else if (N/1==1) {
			System.out.println("该数是1位数");
		}
	}
}
}
