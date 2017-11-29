import java.util.Scanner;


public class Test03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入一个整数");
		int n = sc.nextInt();
		
		if (n>10000) {
			System.out.println("超出范围");
		}else {
			if (n/10000==0&&n/1000!=0) {
				System.out.println("这个数字是四位数");
			}if (n/1000==0&&n/100!=0) {
				System.out.println("这个数字是三位数");
			}if (n/100==0&&n/10!=0) {
				System.out.println("这个数字是二位数");
			}if (n/10==0) {
				System.out.println("这个数字是个位数");
			}
		}
	}

}
