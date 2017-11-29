package com.ad;

import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月27日 下午4:30:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class TestFill {

	public static void main(String[] args) {
		System.out.println("-----成绩管理-----");
		Scanner sc=new Scanner(System.in);
		System.out.println("您需要对多少个成绩计算呢？");
		int a[]=new int[sc.nextInt()];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个成绩：");
			a[i]=sc.nextInt();
		}
		System.out.println("输入完毕，请输入指令：（输入【0】查看帮助）");
		Fill f=new Fill();
		boolean is=true;
		while(is){
			int ins=sc.nextInt();
			switch (ins) {
			case 0:
				f.help();
				break;
			case 1:
				System.out.println("最大值是"+f.max(a));
				break;
			case 2:
				System.out.println("最小值是"+f.min(a));
				break;
			case 3:
				System.out.println("总分是"+f.sum(a));
				break;
			case 4:
				System.out.println("平均分是"+f.average(a));
				break;
			case 5:
				System.out.println("所有成绩："+f.info(a));
				break;
			case 6:
				System.out.println("小于60的有：");
				f.less60(a);
				break;
			case 7:
				System.out.println("升序排列后是："+f.sort(a));
				break;
			case 9:
				System.out.println("感谢您的使用，再见。");
				is=false;
				break;
			default:
				break;
			}
		}
		sc.close();

	}

}
