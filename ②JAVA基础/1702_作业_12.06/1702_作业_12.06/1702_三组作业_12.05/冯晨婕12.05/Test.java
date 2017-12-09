package fcj;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Examine> arrayList = new ArrayList<Examine>();
		ExamineService examineService = new ExamineService();
		Scanner sc = new Scanner(System.in);
		examineService.helpinfo();
		int key ;
		boolean isquit = true;
		while (isquit) {
			 key=sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("1、录入考试信息信息包含姓名、" + "编号、" + "语文、数学、英语成绩，"
						+ "并计算出总成绩");
				examineService.addExamine(arrayList, sc);
				break;
			case 2:
				System.out.println("显示所有考生信息包括姓名、" + "编号、语文、" + "数学、英语成绩、总成绩");
				examineService.infoExamine(arrayList);
				break;
			case 3:
				System.out.println("3、当用户选择3时，又显示一个子菜单：");
				System.out.println("1	打印总分最高分");
				System.out.println("2	打印数学最高分");
				System.out.println("3	打印语文最高分");
				System.out.println("4	打印英语最高分");
				System.out.println("5	退出");
				System.out.println("输入对应数字则显示对应分数，输入5则退出到主界面");
				break;
			case 4:
				System.out.println("4、退出功能可以退出系统");
				isquit = false;
				break;
			default:
				System.out.println("你输入的命令无效");
				break;

			}
		}
		System.out.println("拜拜！！");

	}

}
