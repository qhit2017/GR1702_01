import java.util.Scanner;


public class Test09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ����");
		int N=sc.nextInt();
		int sum=0;
		int a=1;
		int b=1;
		
		if (N>10000) {
			System.out.println("������Χ");
		}if (N%2!=0) {
			while (a <= N) {
				if (a % 2 != 0) {

					sum = sum + a;

				}
				a++;
		}
	 System.out.println(sum);
		
		if (N%2==0) {
			while (b <= N) {
				if (b % 2== 0) {

					sum = sum + b;

				}
				b++;
		}
		System.out.println(sum);
	}		
	}
}
}
