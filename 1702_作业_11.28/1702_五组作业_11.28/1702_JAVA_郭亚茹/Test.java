package Com.score;

import java.util.Scanner;

/**
 * @author ���� E-mail:2379675496@qq.com
 * @date ����ʱ�䣺2017��11��8�� ����6:44:32
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
			System.out.println("��������Ҫִ�е�ָ������س���");
			s = sc.next();
			Object scoreImplment;
			switch (s) {
			case "sum":
				int sum = scoreImplements.getsum(a);
				System.out.println("�ܷ�����" + sum);
				break;

			case "average":
				int average = scoreImplements.getaverage(a);
				System.out.println("��ƽ�����ǣ�" + average);
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

		System.out.println("�ݰ�");
	}

}
