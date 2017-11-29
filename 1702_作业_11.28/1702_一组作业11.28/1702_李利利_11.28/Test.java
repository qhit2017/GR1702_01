import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner sco = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数");
			a[i] = sco.nextInt();
		}

		Scanner sc = new Scanner(System.in);
		ScoreImplment scoreImplment = new ScoreImplment();
		boolean isQuit = true;
		String s;
		scoreImplment.help();
		while (isQuit) {
			System.out.println("请输入你要执行的指令，并按回车键");
			s = sc.next();
			switch (s) {
			case "Sum":
				int sum = scoreImplment.getSum(a);
				System.out.println("总分是:" + sum);
				break;
			case "Average":
				int Average = scoreImplment.getAverage(a);
				System.out.println("平均值是:" + Average);
				break;
			case "Max":
				int max = scoreImplment.getMax(a);
				System.out.println("最大值是:" + max);
				break;
			case "Min":
				int min = scoreImplment.getMin(a);
				System.out.println("最小值是:" + min);
				break;
			case "Not":
				int not = scoreImplment.getNot60(a);
				System.out.println("不及格人数是:" + not);
				break;
			case "Infor":
				scoreImplment.infor(a);
				break;
			case "Sort":
				scoreImplment.sort(a);
				break;

			case "Quit":
				isQuit = false;
				break;

			default:
				break;
			}

		}
		System.out.println("拜拜");

	}

}
