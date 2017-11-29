package Com.score;

import java.util.Scanner;

/**
 * @author 作者 E-mail:2379675496@qq.com
 * @date 创建时间：2017年11月8日 下午6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {
	public static void main(String[] args) {

		int[] a = { 96, 75, 12, 99, 86, 52, 12, 62, 86, 29 };

		Scanner sc = new Scanner(System.in);

		ScoreImplements scoreImplements = new ScoreImplements();

		boolean isQuit = true;

		String s;

		scoreImplements.help();

		while (isQuit) {
			System.out.println("请输入你要执行的指令，并按回车键");
			s = sc.next();
			Object scoreImplment;
			switch (s) {
			case "sum":
				int sum = scoreImplements.getsum(a);
				System.out.println("总分数：" + sum);
				break;

			case "average":
				int average = scoreImplements.getaverage(a);
				System.out.println("求平均分是：" + average);
				break;

			case "info":
				scoreImplements.info(a);
				break;

			case "score":
				scoreImplements.scort(a);
				break;

			case "Quit":
				isQuit = false;

			default:
				break;
			}
		}

		System.out.println("拜拜");
	}

}
