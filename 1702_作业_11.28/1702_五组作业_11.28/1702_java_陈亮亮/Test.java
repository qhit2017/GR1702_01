package Sqare;

import java.util.Scanner;

/**
 * �����ߣ������� ����ʱ�䣺2017��11��27������4:33:28 ���䣺2507147605@qq.com
 */
public class Test {

	

	public static void main(String[] args) {
		int[] a=new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������"+(i+1)+"����");
			a[i] =sc.nextInt();
		}
		
		IRealize realize = new IRealize();
		realize.help();
		boolean isQuit = true;
		String s;

		while (isQuit) {
			System.out.println("��������Ҫִ�е�ָ��,�����س���");
			s = sc.next();
			switch (s) {
			case "sum":
				int sum = realize.getsum(a);
				System.out.println("�ܷ���" + sum);
				break;
			case "Average":
				int average = realize.getAverage(a);
				System.out.println("��ƽ������" + average);
				break;

			case "Max":
				int Max=realize.getMax(a);
				System.out.println("�����ֵ"+ Max);
				break;
			case "Min":
				int Min =realize.getMin(a);
				System.out.println("����Сֵ"+ Min);
				

				break;

			case "Quit":
				isQuit = false;
				break;
			default:
				break;
			}
		}

		System.out.println("�ݰ�");
	}

}
