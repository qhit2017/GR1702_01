package kaoshi1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2004��1��1�� ����10:31:18
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
				System.out.println("������ѧ����Ϣ�ͳɼ�");
				a.add(exams, sc);

				break;
			case 2:
				System.out.println("������Ϣ����");
				a.info(exams);

				break;
			case 3:
				a.hellp1();
				boolean is1 = true;
				while (is1) {
					int key1 = sc.nextInt();
					switch (key1) {
					case 1:
						System.out.println("�ܷ���߷�");
						a.find(exams);
						break;
					case 2:
						System.out.println("��ѧ��߷�");
						a.find2(exams);
						break;
					case 3:
						System.out.println("������߷�");
						a.find1(exams);
						break;
					case 4:
						System.out.println("Ӣ����߷�");
						a.find3(exams);
						break;
					case 5:
						System.out.println("�Ѿ�������һ��");
						is1 = false;
						break;

					default:
						System.out.println("�����������");
						break;
					}
				}

				break;
			case 4:
				System.out.println("��ӭʹ��");
				is = false;
				break;

			default:
				System.out.println("�����������");
				break;
			}
		}
	}
}
