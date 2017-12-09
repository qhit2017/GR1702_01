package kaoshi1;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2004年1月1日 上午8:44:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ExamService implements IExam {
	void hellp(){
		System.out.println("学生考试成绩管理系统");
		System.out.println("1      增加一条信息");
		System.out.println("2      显示所有信息");
		System.out.println("3      总分");
		System.out.println("4      退出");
	}
	
	void hellp1(){
		System.out.println("1	打印总分最高分");
		System.out.println("2	打印数学最高分");
		System.out.println("3	打印语文最高分");
		System.out.println("4	打印英语最高分");
		System.out.println("5       退出");
	}

	//增加
	@Override
	public void add(ArrayList<Exam> a, Scanner sc) {
		String e = sc.next();
		String[] e1 = e.split(",");
		if (e1.length!=5) {
			System.out.println("输入错误请重写");
		} else {
			Exam e2 = new Exam(e1[0], e1[1], Integer.parseInt(e1[2]), Integer.parseInt(e1[3]), Integer.parseInt(e1[4]));
			a.add(e2);
			System.out.println(e2.toString()+e2.getTotal());
		}
		
	}

	//遍历
	@Override
	public void info(ArrayList<Exam> a) {
		for (Exam exam : a) {
			System.out.println(exam.toString()+exam.getTotal());
		}

	}

	//总分
	@Override
	public void find(ArrayList<Exam> a) {
		int max=a.get(0).getTotal();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getTotal()>max) {
				max=a.get(i).getTotal();
			}
		}
		System.out.println("最高分："+max);

	}

	//语文
	@Override
	public void find1(ArrayList<Exam> a) {
		int max=a.get(0).getLanguage();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getLanguage()>max) {
				max=a.get(i).getLanguage();
			}
		}
		System.out.println("最高分："+max);


	}

	//数学
	@Override
	public void find2(ArrayList<Exam> a) {
		int max=a.get(0).getMathematics();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getMathematics()>max) {
				max=a.get(i).getMathematics();
			}
		}
		System.out.println("最高分："+max);

	}

	//英语
	@Override
	public void find3(ArrayList<Exam> a) {
		int max=a.get(0).getEnglish();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getEnglish()>max) {
				max=a.get(i).getEnglish();
			}
		}
		System.out.println("最高分："+max);

	}

}
