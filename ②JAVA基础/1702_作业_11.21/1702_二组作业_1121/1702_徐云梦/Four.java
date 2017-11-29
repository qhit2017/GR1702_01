import java.util.Scanner;

/**
 * 
 */

/** 
 * @author  作者 :xuyunmeng
 * @date    创建时间：2017年11月21日 上午11:34:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Four {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个五位数");
		int a = sc.nextInt();
		if(a%10==a/10000 && a/10%10==a/1000%10){
			System.out.println("是回文数");
		}else{
			System.out.println("不是回文数");
		}
		
	}
}
