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
public class Test {

	public static void main(String[] args) {

		HomeworkImplement homeworkImplement = new HomeworkImplement();

		Scanner sc = new Scanner(System.in);

		ArrayList<Performance> arrayList = new ArrayList<Performance>();

		homeworkImplement.helps();
		boolean isQuit = true;
		while (isQuit) {
			System.out.println("请输入命令并按回车键！");

			String s = sc.next();
			switch (s) {
			case "1":
				System.out.println("请输入要添加的信息:");
				homeworkImplement.addPerformance(arrayList, sc);
				break;
			case "2":
				
				homeworkImplement.infoPerformance(arrayList);
				
				break;

			case "3":
				homeworkImplement.help();
				int key1;
				boolean isExit = true;
				while (isExit) {
					System.out.println("请输入您要查询的指令！");
					key1 = sc.nextInt();
					switch (key1) {
					case 1:
						homeworkImplement.topscorePerformance(arrayList, "总成绩");

						break;
					case 2:
						homeworkImplement.topscorePerformance(arrayList, "数学");

						break;
					case 3:
						homeworkImplement.topscorePerformance(arrayList, "语文");

						break;
					case 4:
						homeworkImplement.topscorePerformance(arrayList, "英语");

						break;
					case 5:
						isExit = false;
						System.out.println("返回主菜单成功！");
						break;

					default:
						System.out.println("您输入的指令有误！");
						break;
					}

				}

				break;
			case "4":
				isQuit = false;
				break;

			default:
				break;
			}

		}
		System.out.println("退出系统");
	}

}
