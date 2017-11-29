package com.zk;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月27日 下午4:34:56 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		ScoreImplment scoreImplment =new ScoreImplment();
		int[] a = {12,23,15,16,85,8,7,9,45,56};
		Scanner sc = new Scanner(System.in);	
		boolean isquit =true;
		String s;
scoreImplment.help();
		
		while (isquit) {
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
			case "Max":
				
				int Max= scoreImplment.getMax(a);
				System.out.println("最大值是："+Max);
				break;
				
			case "Min":
				
				int Min= scoreImplment.getMin(a);
				System.out.println("最小值是："+Min);
				break;
			case"Not60":
				int Not60 =scoreImplment.getMin(a);
				System.out.println("不及格人数是"+Not60);
				break;
			case "isquit":
				isquit = false;
				break;
			default:
				break;
			}
		}

		System.out.println("拜拜");
	}

	}

