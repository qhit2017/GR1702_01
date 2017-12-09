package com.ooo;

import java.util.ArrayList;
import java.util.Scanner;

/*制作人：王欣
 *日期2017年12月5日时间下午4:56:08
 *邮箱:2408368509@qq.com
 */

public class ScoreService implements IScore {
	
	void helpinfo(){
		System.out.println("--------考试帮助信息-------");
		System.out.println("【1】增加");
		System.out.println("【2】显示所有");
		System.out.println("【3】最高分");
		System.out.println("【4】退出功能");
		
	}

	@Override
	public void AddStudent(ArrayList<Student> arrayList, Scanner sc) {
		// TODO Auto-generated method stub
		String w = sc.next();
		String[] x = w.split(",");
		int length = x.length;
		if (length!=5) {
			System.out.println("您输入的信息有误或不完整，请重新输入");
		} else {
		Student student = new Student();
		student.setName(x[0]);
		student.setId(x[1]);
		student.setEnglish(Double.parseDouble(x[2]));
		student.setChiese(Double.parseDouble(x[3]));
		student.setMath(Double.parseDouble(x[4]));
		arrayList.add(student);
		System.out.println(student);
	}
	}
	@Override
	public void infoStudent(ArrayList<Student> arrayList) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
	}

	@Override
	public double getMAX(ArrayList<Student> arrayList, Scanner sc) {
		System.out.println("当用户选择3时，又显示一个子菜单：");
		System.out.println("1 打印语文最高分");
		System.out.println("2 打印数学最高分");
		System.out.println("3 打印英语最高分");
		System.out.println("4 打印总分最高分");
		System.out.println("5 退出");
		boolean isexit=true;
		while (isexit) {
			int nextInt = sc.nextInt();
			switch (nextInt) {
			case 1:
				double maxLanguage=0;
				
				for (int i = 0; i < arrayList.size(); i++) {
					double chiese = arrayList.get(i).getChiese();
					if (chiese>maxLanguage) {
						maxLanguage=chiese;
					}
				}
				System.out.println("语文最高分为："+maxLanguage);
				break;
			case 2:
				double maxMath=0;
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getMath()>maxMath) {
						maxMath=arrayList.get(i).getMath();
					}
				}
				System.out.println("数学最高分："+maxMath);
				break;
			case 3:
				double maxEnglish=0;
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getEnglish()>maxEnglish) {
						maxEnglish=arrayList.get(i).getEnglish();
					}
				}
				System.out.println("英语最高分："+maxEnglish);
				break;
			case 4:
				double maxScore=0;
				for (int i = 0; i < arrayList.size(); i++) {
					if (arrayList.get(i).getScore()>maxScore) {
						maxScore=arrayList.get(i).getScore();
					}
				}
				System.out.println("总分最高分为："+maxScore);
				break;
			case 5:
				isexit=false;
				break;
			default:
				System.out.println("指令无效");
				break;
			}
		}
		System.out.println("已退出最高分管理系统");
		return 0;
		// TODO Auto-generated method stub
	}

	
}
