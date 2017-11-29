package lijingjing;

import java.util.Scanner;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月14日 下午5:40:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Operator {

	public static void main(String[] args) {
		/*利用三元条件运算符的嵌套或选择结构来完成此题：
		 * 学习成绩>=90分的同学用A表示，60-89分之间的
		 * 用B表示，60分以下的用C表示。
		 */
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个数");
		int score =sc.nextInt();
		if(score>=90){
			System.out.println("A");
		}
		if(score<=89&&score>=60){
			System.out.println("B");
		}
		if(score<=60){
			System.out.println("C");
		}
		
		
	}
}
