import java.util.Scanner;

/** 
 * @author  作者 于和璧
 * @date    创建时间：2017年11月26日 下午9:03:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test9 {

	public static void main(String[] args) {

		System.out.println("第九题");
		System.out.println("输入一个整数N(0<N<=1000)");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;

		int a = 1;
		int b = 1;
		if (N % 2 != 0) {
			while (a <= N) {
				if (a % 2 != 0) {
					sum = sum + a;
				}
				a++;
			}
			System.out.println("奇数和为:" + sum);
		}

		if (N % 2 == 0) {

			while (b <= N) {
				if (b % 2 == 0) {
					sum = sum + b;
				}
				b++;
			}
			System.out.println("偶数的和为:" + sum);
		}

	}
}
