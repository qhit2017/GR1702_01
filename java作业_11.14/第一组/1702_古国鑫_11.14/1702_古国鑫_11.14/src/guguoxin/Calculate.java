package guguoxin;

import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年11月14日 下午8:53:23 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		int a = sc.nextInt();
	if (a>=90){
		System.out.println("A");
	}else if(90>a&&a>=60){
		System.out.println("B");
	}else if(a<60){
		System.out.println("C");
	}
		
		sc.close();
	}
}
