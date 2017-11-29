package Test;

import java.util.Scanner;
/*制作人：王欣
 *制作时间：2017年11月26日下午6:15:28
 *邮箱：2408368509@qq.com
 */

public class Test4 {
	public static void main(String[] args) {
	//成绩>=90分的用A表示，60~89分之间用B表示，60分以下用C表示，编写java程序
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入成绩：");
		int i = sc.nextInt();
		if(i>=90){
			System.out.println("A");
		}else if(i>60){
			System.out.println("B");
		}else{
			System.out.println("C");
		}
		
		
	}

}
