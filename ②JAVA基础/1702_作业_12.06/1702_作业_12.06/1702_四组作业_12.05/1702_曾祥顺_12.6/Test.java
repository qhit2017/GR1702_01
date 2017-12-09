package kaoshi1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2004年1月1日 上午10:31:18
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<Exam> exams = new ArrayList<Exam>();
		ExamService a = new ExamService();
		Scanner sc = new Scanner(System.in);
		a.hellp();
		boolean is = true;
		while (is) {
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入学生信息和成绩");
				a.add(exams, sc);

				break;
			case 2:
				System.out.println("所有信息如下");
				a.info(exams);

				break;
			case 3:
				a.hellp1();
				boolean is1 = true;
				while (is1) {
					int key1 = sc.nextInt();
					switch (key1) {
					case 1:
						System.out.println("总分最高分");
						a.find(exams);
						break;
					case 2:
						System.out.println("数学最高分");
						a.find2(exams);
						break;
					case 3:
						System.out.println("语文最高分");
						a.find1(exams);
						break;
					case 4:
						System.out.println("英语最高分");
						a.find3(exams);
						break;
					case 5:
						System.out.println("已经返回上一层");
						is1 = false;
						break;

					default:
						System.out.println("输入命令错误");
						break;
					}
				}

				break;
			case 4:
				System.out.println("欢迎使用");
				is = false;
				break;

			default:
				System.out.println("输入命令错误");
				break;
			}
		}
	}
}
