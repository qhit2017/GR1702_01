/**
 * 
 */
package f;
import java.util.Scanner;

/**
 * @author 作者：冯晨婕  E-mail:2570804732@qq.com
 * @date 创建时间：26 Nov 2017 5:57:43 Ntambama
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
public class Third {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入一位数N,N<=10000");
	int n=sc.nextInt();
	if(n<10){
		System.out.println("n是一位數");	
	}
	if(n>=10&&n<100){
		System.out.println("n是二位數");	
	}
	if(n>=100&&n<1000){
		System.out.println("n是三位數");	
	}
	if(n>=1000&&n<10000){
		System.out.println("n是四位數");	
	}
	if(n==10000){
		System.out.println("n是五位數");	
	}
	
	
	
	
	
	
	
	}
}

