import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��25�� ����1:44:03 
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
			System.out.println("�������");
		}
		System.out.println(sum);
		sc.close();
	}
}
