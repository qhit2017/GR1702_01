package N1;

import java.util.Scanner;

/*制作人：王欣
 *制作时间：2017年11月13日下午8:13:14
 *邮箱：2408368509@qq.com
 */

public class N3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("输入的成绩：");
		int score =sc.nextInt();
		
		if (score>=90){
			System.out.println("A");
		}else if(score>=60){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
	}

}
