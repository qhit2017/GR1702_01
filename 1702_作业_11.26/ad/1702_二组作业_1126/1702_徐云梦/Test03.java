import java.util.Scanner;

/**
 * 
 */

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月26日 下午1:07:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个不大于10000的整数");
		int a =sc.nextInt();
		if (a<10) {
			System.out.println("一位数");
		}else if (a<100) {
			System.out.println("两位数");
		}else if (a<1000) {
			System.out.println("三位数");
		}else if (a<10000) {
			System.out.println("四位数");
		}
	}

}
