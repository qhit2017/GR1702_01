import java.util.Scanner;

/** 
 * @author  作者 E-mail:1243629747@163.com
 * @date    创建时间：2017年11月14日 下午5:07:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
/*3、利用三元条件运算符的嵌
  	 套或选择结构来完成此题：
     学习成绩>=90分的同学用A表示，
     60-89分之间的用B表示，
     60分以下的用C表示。
*/
public class Score {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("第三题:\n请输入分数:");
	int score = sc.nextInt();
	if(score >= 90){
		System.out.println("A");
	}
	 if(score >= 60 && score <90){
		System.out.println("B");
	}
	if(score < 60){
		System.out.println("C");
	}
	sc.close();
}
}
