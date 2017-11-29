import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月26日 下午8:06:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test4 {

	public static void main(String[] args) {
		System.out.println("第四题:");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个1到100的整数");
		int a =sc.nextInt();
		
		if(a>=90){
			System.out.println("A");
		}else if(a>=60&&a<=89){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
	}
}
