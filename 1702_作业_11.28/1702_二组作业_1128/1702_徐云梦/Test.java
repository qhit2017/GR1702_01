import java.util.Scanner;

/**
 * 
 */

/**
 * @author ���� :xuyunmeng
 * @date ����ʱ�䣺2017��11��27�� ����4:29:27
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {
	public static void main(String[] args) {
		int[] a =new int[10];
		Scanner sct = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������"+(i+1)+"����");
			a[i] = sct.nextInt();
		} 
		
		//int[] a = { 25, 89, 96, 68, 77, 56, 78, 99, 12, 71 };
		Scanner sc = new Scanner(System.in);
		ScoreTest scoreTest = new ScoreTest();
		boolean isQuit = true;
		String s;
		scoreTest.help();

		while (isQuit) {
			System.out.println("��������Ҫִ�е�ָ������س���");
			s = sc.next();
			switch (s) {
			case "Average":
				int average = scoreTest.getAverage(a);
				System.out.println("ƽ������"+average);
				break;
				
			case "Sum":
				int sum = scoreTest.getSum(a);
				System.out.println("�ܷ���"+sum);
				break;
				
			case "Max":
				int max = scoreTest.getMax(a);
				System.out.println("���ֵ��"+max);
				break;
				
			case "Min":
				int min = scoreTest.getMin(a);
				System.out.println("��Сֵ��"+min);
				break;
				
			case "Not":
				int not = scoreTest.getNot(a);
				System.out.println("������������"+not);
				break;
			case "Info":
				scoreTest.info(a);
				break;
			case "Sort":
				scoreTest.sort(a);
				break;
			case "Quit":
				isQuit = false;
				break;
			default:
				break;
			}

		}
		System.out.println("�ټ�");
	}

}
