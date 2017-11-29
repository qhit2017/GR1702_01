import java.util.Scanner;


public class N {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数字:");
		double N=sc.nextDouble();
		for(int n=1;n<=1000;n++){
			if(n%7==0||n%10==7){
				System.out.println(n);
			}
		}
	}

}
