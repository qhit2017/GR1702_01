package Com.Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ���� E-mail:1561061182@qq.com
 * @date ����ʱ�䣺2017��11��8�� ����6:44:32
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
			System.out.println("������������س�����");

			String s = sc.next();
			switch (s) {
			case "1":
				System.out.println("������Ҫ��ӵ���Ϣ:");
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
					System.out.println("��������Ҫ��ѯ��ָ�");
					key1 = sc.nextInt();
					switch (key1) {
					case 1:
						homeworkImplement.topscorePerformance(arrayList, "�ܳɼ�");

						break;
					case 2:
						homeworkImplement.topscorePerformance(arrayList, "��ѧ");

						break;
					case 3:
						homeworkImplement.topscorePerformance(arrayList, "����");

						break;
					case 4:
						homeworkImplement.topscorePerformance(arrayList, "Ӣ��");

						break;
					case 5:
						isExit = false;
						System.out.println("�������˵��ɹ���");
						break;

					default:
						System.out.println("�������ָ������");
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
		System.out.println("�˳�ϵͳ");
	}

}
