import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月25日 下午1:44:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		if (0<n||n<=1000) {
			if (n%2==0) {
				for (int a = 1; a <= n; a++) {
					if (a%2==0) {
						sum = sum + a;
					}
				}
			} else {
				for (int a = 1; a <= n; a++) {
					if (a%2!=0) {
						sum = sum + a;
					}
				}

			}
		}else{
			System.out.println("输入错误");
		}
		System.out.println(sum);
		sc.close();
	}
}
