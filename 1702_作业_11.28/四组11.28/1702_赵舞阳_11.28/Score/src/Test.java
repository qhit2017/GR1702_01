import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int[] a = { 44, 55, 66, 88, 71, 97, 54, 65, 12, 74 };
		Scanner sc = new Scanner(System.in);
		ScoreImplment scoreImplment = new ScoreImplment();
		boolean isEsc = true;
		String s;
		scoreImplment.help();
		while (isEsc) {
			System.out.println("�ڴ�����ָ���ѯ�ɼ�");
			s = sc.next();
			switch (s) {
			case "sum":
				int sum = scoreImplment.getSum(a);
				System.out.println("�ܷ�:" + sum);
				break;
			case "average":
				int average = scoreImplment.getAverage(a);
				System.out.println("ƽ����:" + average);
				break;
			case "max":
				int max = scoreImplment.getMax(a);
				System.out.println("��߷�:" + max);
				break;
			case "min":
				int min = scoreImplment.getMin(a);
				System.out.println("��ͷ�:" + min);
				break;
			case "Not60":
				int Not60 = scoreImplment.getNot60(a);
				System.out.println("��������:" + Not60);
				break;
			case "Info":
				scoreImplment.info(a);
				break;
			case "Sort":
				scoreImplment.sort(a);
				break;
			case "Esc":
				isEsc = false;
				break;
			default:
				break;
			}
		}
		System.out.println("�˳�");
		sc.close();
	}
}
