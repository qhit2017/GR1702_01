package Student;

import java.sql.Blob;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:295852280@qq.com
 * @date    创建时间：2017年11月13日 下午8:08:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Practice {
	public static void main(String[] args) {
		//利用三元条件运算符的嵌套或选择结构来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
		
		System.out.println("第三题:");
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个同学的成绩:");
		int score =sc.nextInt();
		if(score>90){
			System.out.println("该同学获得的等级为:A");
		}
		if(score>=60&&score<90){
			System.out.println("该同学获得的等级为:B");
		}
		if(score<60){
			System.out.println("该同学获得的等级为:c");
		}
		boolean math=(score>=60)?true:false;
		System.out.println(true);
		
	}

}
