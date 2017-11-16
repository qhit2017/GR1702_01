import java.util.Scanner;


/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月13日 下午8:36:50 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Operation {

	public static void main(String[] args) {
		//学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
			Scanner sc = new Scanner(System.in);
			System.out.println("输入一个成绩");
			int a = sc.nextInt();
			boolean b;
			b = (a>=60)?true:false;
			System.out.println("b的值为:"+b);
			if(a >= 90){
				System.out.println("为A");
			}else if (a>=60 && a <= 89){
				System.out.println("为B");
			}else if (a < 60){
				System.out.println("为C");
			}
	}
}
