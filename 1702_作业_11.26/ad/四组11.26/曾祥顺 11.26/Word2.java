import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月25日 下午12:26:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		if (a>=100||a<=999) {
			b=a/10%10;
			System.out.println(b);
		} else {
			System.out.println("这不是一个三位数");

		}
		sc.close();
	}

}
