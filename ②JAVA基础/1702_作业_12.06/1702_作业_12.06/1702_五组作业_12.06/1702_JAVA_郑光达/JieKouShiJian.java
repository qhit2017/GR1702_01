/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月5日 下午6:56:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Test01;

import java.util.ArrayList;
import java.util.Scanner;

import com.homework.PrimeNumber;

public class JieKouShiJian implements IJiekou {

	@Override
	public void help() {
		System.out.println("---成绩管理系统帮助---");
		System.out.println("1      录入成绩信息");
		System.out.println("2      显示成绩信息");
		System.out.println("3      各科最高成绩查询");
		System.out.println("4      退出程序系统");

	}

	void help1() {
		System.out.println("---各科最高成绩查询---");
		System.out.println("1      打印总分最高分");
		System.out.println("2      打印数学最高分");
		System.out.println("3      打印语文最高分");
		System.out.println("4      打印英语最高分");
		System.out.println("5      返回主菜单");
	}

	@Override
	public void add(ArrayList<Performance> arrayList, Scanner sc) {
		String next = sc.next();
		String[] a = next.split(",");
		if (a.length != 5) {
			System.out.println("您输入的格式不正确！");
			System.out.println("格式为：");
			System.out.println("名字,编号,语文成绩,数学成绩,英语成绩");
		} else {
			Performance performance = new Performance();

			performance.setName(a[0]);
			performance.setId(a[1]);
			performance.setLanguage(Double.parseDouble(a[2]));
			performance.setMath(Double.parseDouble(a[3]));
			performance.setEnglish(Double.parseDouble(a[4]));

			arrayList.add(performance);
			System.out.println(performance.toString());
		}

	}

	@Override
	public void info(ArrayList<Performance> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}System.out.println("\n加载完毕\n");

	}

	@Override
	public void languagemax(ArrayList<Performance> arrayList) {
		
		double max = 0;
		max = arrayList.get(0).getLanguage();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getLanguage()>max) {
				max = arrayList.get(i).getLanguage();
			}
		}System.out.println(max);

	}

	@Override
	public void Englishmax(ArrayList<Performance> arrayList) {
		double max = 0;
		max = arrayList.get(0).getEnglish();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getEnglish()>max) {
				max = arrayList.get(i).getEnglish();
			}
		}System.out.println(max);

	}

	@Override
	public void mathmax(ArrayList<Performance> arrayList) {
		double max = 0;
		max = arrayList.get(0).getMath();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getMath()>max) {
				max = arrayList.get(i).getMath();
			}
		}System.out.println(max);

	}

	@Override
	public void summax(ArrayList<Performance> arrayList) {
		double max = 0;
		max = arrayList.get(0).getsum();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getsum()>max) {
				max = arrayList.get(i).getsum();
			}
		}System.out.println(max);

	}

}
