package com.chen;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:chenglong271406@163.com
 * @date    创建时间：2017年11月27日 下午4:13:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		
		int[] a = {58,68,79,89,22,99,65,36,95,77};
		Scanner sc = new Scanner(System.in);
		Score scoreImplment = new ScoreImplment();
		boolean isQuit = true;
		String s;
		scoreImplment.help();
		while (isQuit) {
			System.out.println("请输入你要执行的指令，并按回车键");
			s = sc.next();
			switch (s) {
			case "sum":
				int sum = scoreImplment.getSum(a);
				System.out.println("总分是"+sum);
				break;
			
			case "Average":
				
				int average = scoreImplment.getAverage(a);
				System.out.println("求平均分是"+average);
				break;
				
			case "Info":
				
				scoreImplment.info(a);

				break;
			
			case "Sort":
				
				scoreImplment.sort(a);

				break;
				
			case "Quit":
				isQuit = false;
				break;
			default:
				break;
			}
		}

		System.out.println("拜拜");
	}

}
