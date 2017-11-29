import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月25日 下午4:17:17 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个数:");
		int a=sc.nextInt();
		if(a>0&&a<10){
			System.out.println("这是一位数");
		}
		if(a>=10&&a<100){
			System.out.println("这是二位数");
		}
		if(a>=100&&a<1000){
			System.out.println("这是三位数");
		}
		if(a>=1000&&a<10000){
			System.out.println("这是四位数");
		}
		if(a==10000){
			System.out.println("这是五位数");
		}
	}
}
