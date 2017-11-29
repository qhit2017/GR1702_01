package Score;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:李永立271406@163.com
 * @date    创建时间：2017年11月14日 下午9:44:45 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public class Score {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入成绩：");
		int a = sc.nextInt();
		if (a>=90){
			System.out.println("A");
		}if(a>=60&&a<=89){
			System.out.println("B");
		}if(a<60){
			System.out.println("C");
		}
	}

}
