import java.util.Scanner;

/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月26日 下午2:17:52
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个数");
		int a = sc.nextInt();
		int sum = 0;
		int sam = 0;
		if (a > 0 && a <= 1000) {
			if (a%2!=0) {
				for (int j = 0; j < a; j++) {
					if (j%2!=0) {
						sum=sum+j;
					}
				}
				System.out.println("该数是奇数，和为"+sum);
			}
			if (a%2==0) {
				for (int k = 0; k < a; k++) {
					if (k%2==0) {
						sam=sam+k;
					}
				}
				System.out.println("该数是偶数，和为"+sam);
			}
		}else{
			System.out.println("不在范围内");
		}
	}

}
