import java.util.ArrayList;
import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 ArrayList<GradeSystem> arrayList = new ArrayList<GradeSystem>();
		 GradeService gradeService = new GradeService();
		 gradeService.help();
		 
		 int key = 0;
		 int key1 = 0;
		 boolean isQuit = true;
		 boolean Exit = true;
		 while (isQuit) {
			System.out.println("请输入指令,并按回车键");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("录入考试信息并包含姓名、编号、语文、数学、英语成绩，还要计算出总成绩");
				gradeService.addGrade(arrayList, sc);
				break;
			case 2:
				System.out.println("浏览所有考试信息");
				gradeService.infoGrade(arrayList);
				break;
			case 3:
				gradeService.help1();
				while (Exit) {
					System.out.println("请输入指令,并按回车键");
					key1 = sc.nextInt();
					switch (key1) {
					case 1:
						System.out.println("总分最高分是");
					    gradeService.findsungrade(arrayList);
						break;
					case 2:
						System.out.println("语文最高分是");
						gradeService.findchinesegrade(arrayList);
						break;
					case 3:
						System.out.println("数学最高分是");
						gradeService.findmathgrade(arrayList);
						break;
					case 4:
						System.out.println("英语最高分是");
						gradeService.findenglishgrade(arrayList);
						break;
					case 5:
						Exit = false;
						break;

					default:
						break;
					}
				}
				System.out.println("退出子菜单了");
				break;
			case 4:
				isQuit = false;
				break;

			default:
				break;
			}
		}
		 System.out.println("退出系统了,拜拜");
	}

}
