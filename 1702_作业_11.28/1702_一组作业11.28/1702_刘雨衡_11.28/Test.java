package lyh;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sor = new Scanner(System.in);
		int[] a= new int[10] ;
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("�������"+(i+1)+"ѧ���ɼ���");
			a[i]= sor.nextInt();
		}
		ScoreImplment sc = new ScoreImplment();
		sc.help();

		String a2;
		boolean isQuit = true;
		while (isQuit) {
			System.out.println("�����������Enter����");

			a2 = sor.next();

			switch (a2) {

			case "Sum":
				int sum = sc.getSum(a);
				System.out.println("�ܷ���" + sum);
				break;

			case "Average":
				int Average = sc.getAverage(a);
				System.out.println("�ܷ���" + Average);
				break;

			case "sort":
				sc.sort(a);
				break;

			case "Not60":
				int Not = sc.getNot60(a);
				System.out.println("������������" + Not + "��");
				break;

			case "Max":
				int max = sc.getMax(a);
				System.out.println("���ֵ�ǣ�" + max);
				break;

			case "Min":
				int Min = sc.getMin(a);
				System.out.println("��Сֵ�ǣ�" + Min);
				break;

			case "Info":
				sc.info(a);
				break;

			case "isQuit":

				isQuit = false;
			default:
				break;
			}
		}
		System.out.println("�ټ���");
		sor.close();
	}

}
