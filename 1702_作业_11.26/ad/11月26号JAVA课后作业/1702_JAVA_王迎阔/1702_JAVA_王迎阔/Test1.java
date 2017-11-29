import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月24日 下午1:39:33 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test1 {
	
	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		 System.out.println("请输入两个小数");
		 double a =sc.nextDouble();
		 double b =sc.nextDouble();
		 if (a==b) {
			System.out.println("a和b相等");
		} else {
			System.out.println("a和b不相等");
		}
	}

}
