package Com.Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 作者 E-mail:1561061182@qq.com
 * @date 创建时间：2017年11月8日 下午6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class HomeworkImplement implements HomeworkInterface {
	void helps() {
		System.out.println("---分数查询帮助系统---");
		System.out.println("【1】  录入考生成绩信息请输入1");
		System.out.println("【2 】查询考生成绩信息请输入3");
		System.out.println("【3 】 进入子菜单请输入3");
		System.out.println("【4 】退出系统请输入4 ");

	}

	@Override
	public void help() {
		System.out.println("---评分数查询帮助系统---");
		System.out.println("【1】  打印总分最高分请输入1");
		System.out.println("【2 】打印数学最高分请输入2");
		System.out.println("【3 】 打印语文最高分请输入3");
		System.out.println("【4 】打印英语最高分请输入14");
		System.out.println("【5 】返回主菜单请输入5");

	}

	@Override
	public void addPerformance(ArrayList<Performance> arrayList, Scanner sc) {
		String string = sc.next();
		String[] a = string.split(",");
		if (a.length !=5) {
			
			System.out.println("您输入格式错误请从新输入！");
			
		} else {
			Performance Performance = new Performance(a[0], a[1],
					Double.parseDouble(a[2]), Double.parseDouble(a[3]),
					Double.parseDouble(a[4]));
			arrayList.add(Performance);
			System.out.println(arrayList.toString());
		}

	}

	@Override
	public void infoPerformance(ArrayList<Performance> arrayList) {
		for (Performance performance : arrayList) {
			System.out.println(performance.toString());
		}

	}

	@Override
	public void topscorePerformance(ArrayList<Performance> arrayList, String Grade) {
		
		double Max = 0;
	if (Grade.equals("总成绩")) {
		Max = arrayList.get(0).getSum();
		
		for (int i =1; i <arrayList.size(); i++) {
			if (arrayList.get(i).getSum()>Max) {
				
				Max = arrayList.get(i).getSum();
				
			}
			
		}
		System.out.println(Max);
	}
	
	if (Grade.equals("语文")) {
		Max = arrayList.get(0).getChineseScore();
		
		for (int i =1; i <arrayList.size(); i++) {
			if (arrayList.get(i).getChineseScore()>Max) {
				
				Max = arrayList.get(i).getChineseScore();
				
			}
			
		}
		System.out.println(Max);
	}
	if (Grade.equals("数学")) {
		Max = arrayList.get(0).getMathScore();
		
		for (int i =1; i <arrayList.size(); i++) {
			if (arrayList.get(i).getMathScore()>Max) {
				
				Max = arrayList.get(i).getMathScore();
				
			}
			
		}
		System.out.println(Max);
	}
	if (Grade.equals("英语")) {
		Max = arrayList.get(0).getEnglish();
		
		for (int i =1; i <arrayList.size(); i++) {
			if (arrayList.get(i).getEnglish()>Max) {
				
				Max = arrayList.get(i).getEnglish();
				
			}
			
		}
		System.out.println(Max);
	}

	}
}
