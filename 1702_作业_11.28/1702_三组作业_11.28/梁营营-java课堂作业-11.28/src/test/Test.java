package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[]=new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������"+(i+1)+"��������");
			a[i]=sc.nextInt();
		}
		
		ScoreImplements scoreImplements = new ScoreImplements();
		boolean isQuit = true;
		String s;
		scoreImplements.help();
		while (isQuit) {
			System.out.println("��������Ҫִ�е���������س���");
			s = sc.next();
			switch (s) {
			case "Sum":
				int sum = scoreImplements.getSum(a);
				System.out.println("�����ܷ�Ϊ��" + sum);
				break;
			case "Average":
				int Average = scoreImplements.getAverage(a);
				System.out.println("����ƽ����Ϊ��" + Average);
				break;
			case "Max":
				int Max = scoreImplements.getMax(a);
				System.out.println("�������ֵΪ��" + Max);
				break;
			case "Min":
				int Min = scoreImplements.getMin(a);
				System.out.println("������СֵΪ��" + Min);
				break;
			case "Info":
				scoreImplements.Info(a);

				break;
			case "Sort":
				scoreImplements.Sort(a);

				break;
			case "Not":
				scoreImplements.getNot60(a);

				break;

			case "Quit":
				isQuit = false;
				break;
			default:
				break;
			}
		}
		System.out.println("��л�˴�ʹ�ã��ټ���");
	}
}
