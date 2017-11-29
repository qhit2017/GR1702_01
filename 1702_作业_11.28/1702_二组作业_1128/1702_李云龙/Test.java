import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		int[] a = { 56, 87, 58, 79, 89, 98, 99, 54, 36, 100 };
		Scanner sc = new Scanner(System.in);
		ScoreTest scoreTest = new ScoreTest();
		boolean isQuit = true;
		String s;
		scoreTest.help();

		while (isQuit) {
			System.out.println("������һ����");
			s = sc.next();
			switch (s) {

			case "Info":

				scoreTest.info(a);
				break;

			case "Average":

				int average = scoreTest.getArerage(a);
				System.out.println("��ƽ������" + average);
				break;

			case "sum":
				int sum = scoreTest.getSum(a);
				System.out.println("�ܷ���" + sum);
				break;

			case "Max":
				System.out.println("�����ֵΪ" + scoreTest.getMax(a));
				scoreTest.sort(a);

				break;

			case "Min":
				System.out.println("����СֵΪ" + scoreTest.getMin(a));
				scoreTest.sort(a);

			case "Sort":

				scoreTest.sort(a);
				System.out.println("��������Ϊ" + scoreTest.sort(a));
				break;
			case "Not":

				scoreTest.getNot(a);
				System.out.println("�󲻼�������Ϊ" + scoreTest.getNot(a));
				break;

			case "Quit":
				isQuit = false;
				break;
			default:
				break;
			}
		}

		System.out.println("����");
		sc.close();
	}

}
