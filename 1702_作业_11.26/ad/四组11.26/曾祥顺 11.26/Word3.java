import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月25日 下午12:35:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	int b = 0;
	if (i>0||i<10000) {
		for (int a=i ;a>0; a=a/10) {
			b++;
		}
		System.out.println("这是"+b+"位数");
	} else {
		System.out.println("输入错误");
		sc.close();

	}
}
}
