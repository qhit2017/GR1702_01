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
			System.out.println("请输入一个数");
			s = sc.next();
			switch (s) {

			case "Info":

				scoreTest.info(a);
				break;

			case "Average":

				int average = scoreTest.getArerage(a);
				System.out.println("求平均分是" + average);
				break;

			case "sum":
				int sum = scoreTest.getSum(a);
				System.out.println("总分是" + sum);
				break;

			case "Max":
				System.out.println("求最大值为" + scoreTest.getMax(a));
				scoreTest.sort(a);

				break;

			case "Min":
				System.out.println("求最小值为" + scoreTest.getMin(a));
				scoreTest.sort(a);

			case "Sort":

				scoreTest.sort(a);
				System.out.println("升序排序为" + scoreTest.sort(a));
				break;
			case "Not":

				scoreTest.getNot(a);
				System.out.println("求不及格人数为" + scoreTest.getNot(a));
				break;

			case "Quit":
				isQuit = false;
				break;
			default:
				break;
			}
		}

		System.out.println("结束");
		sc.close();
	}

}
