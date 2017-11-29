import java.util.Scanner;

/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月26日 下午12:48:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("输入一个三位数");
		int a = sc.nextInt();
		int b = 0;
		b = a/10%10;
		System.out.println("该数的十位数是"+b);
		
	}

}
