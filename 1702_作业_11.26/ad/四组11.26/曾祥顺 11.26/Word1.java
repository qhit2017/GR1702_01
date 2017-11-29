import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月25日 下午12:16:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("键盘输入两个小数");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a==b) {
			
			System.out.println("这两个数相等");
			
		}else{
			
			System.out.println("这两个数不相等");
		}
		sc.close();
	}
}
