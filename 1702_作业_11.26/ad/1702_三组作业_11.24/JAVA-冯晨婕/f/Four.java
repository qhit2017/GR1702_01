/**
 * 
 */
package f;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：26 Nov 2017 6:06:55 Ntambama
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Four {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		System.out.println("请输成績");
		int a=sc.nextInt();
		if(a>=90){
			System.out.println("A");
		}
		if(a<=89&&a>=60){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
}
	 
}
