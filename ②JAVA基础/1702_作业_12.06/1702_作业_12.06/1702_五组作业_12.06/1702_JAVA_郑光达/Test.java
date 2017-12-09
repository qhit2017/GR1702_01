/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月5日 下午7:33:16 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
*/
package com.Test01;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Performance> arrayList = new ArrayList<Performance>();

		JieKouShiJian jieKouShiJian = new JieKouShiJian();

		jieKouShiJian.help();
		int key;
		boolean isQure = true;
		while (isQure) {
			System.out.println("\n---请输入您的指令：---\n");
			key = sc.nextInt();

			switch (key) {
			case 1:
				System.out.println("请输入您要添加的信息：");
				System.out.println("格式为：");
				System.out.println("名字,编号,语文成绩,数学成绩,英语成绩");
				jieKouShiJian.add(arrayList, sc);
				break;
			case 2:
				jieKouShiJian.info(arrayList);
				break;
			case 3:
				jieKouShiJian.help1();
				int key1;
				boolean isExit = true;
				while (isExit) {
					System.out.println("请输入您要查询的指令！");
					key1 = sc.nextInt();
					switch (key1) {
					case 1:
						jieKouShiJian.summax(arrayList);
						break;
					case 2:
						jieKouShiJian.mathmax(arrayList);
						break;

					case 3:
						jieKouShiJian.languagemax(arrayList);
						break;
					case 4:
						jieKouShiJian.Englishmax(arrayList);
						break;

					case 5:
						isExit = false;
						System.out.println("返回上一层成功！");
						jieKouShiJian.help();
						break;

					default:
						System.out.println("您输入的指令有误！");
						break;
					}

				}

				break;
			case 4:
				isQure = false;
				break;

			default:
				System.out.println("您输入的指令有误！");
				break;
			}

		}
		System.out.println("-----退出系统成功-----");
	}

}
