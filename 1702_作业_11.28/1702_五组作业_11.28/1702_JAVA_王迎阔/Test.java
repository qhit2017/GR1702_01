package com.qhit.wyk;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:34:47 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		
		int[]a= {17,8,9,10,12,13,14,15,16,7};

		Scanner sc = new Scanner(System.in);
		ScoerImplements scoerImplements = new ScoerImplements();
		boolean isQuit =true;
		String s;
		scoerImplements.help();
		while (isQuit) {
			System.out.println("请输入您要执行的指令，并按回车键");
			s=sc.next();
			switch (s) {
			case "sum":
				int sum=scoerImplements.getsum(a);
				System.out.println("总分是"+sum);
				break;
				
			case"Average":
				
				int average = scoerImplements.getAverage(a);
				System.out.println("平均分是"+average);
				break;
				
				
				
			case"Max":
				System.out.println("最大值为:"+scoerImplements.getMax(a));
				break;
				
				
			case"min":
				System.out.println("最小值为:"+scoerImplements.getmin(a));
				break;
				
				
				
				
			case "Not":	
				System.out.println("不及格的人数为:"+scoerImplements.getNot60(a)+"人");
				break;
				
				
			case"Info":
				scoerImplements.info(a);
				
				break;
				
				
			case"Sort":
				
				scoerImplements.sort(a);
				
				break;
				
				
			case"Quit":
				isQuit=false;
				break;
			default:
				break;
			}
		}
		System.out.println("拜拜");
	}
}


