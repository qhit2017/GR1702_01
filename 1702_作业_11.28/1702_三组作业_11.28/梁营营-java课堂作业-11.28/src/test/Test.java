package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[]=new int[10];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个分数：");
			a[i]=sc.nextInt();
		}
		
		ScoreImplements scoreImplements = new ScoreImplements();
		boolean isQuit = true;
		String s;
		scoreImplements.help();
		while (isQuit) {
			System.out.println("请输入您要执行的命令，并按回车键");
			s = sc.next();
			switch (s) {
			case "Sum":
				int sum = scoreImplements.getSum(a);
				System.out.println("输入总分为：" + sum);
				break;
			case "Average":
				int Average = scoreImplements.getAverage(a);
				System.out.println("输入平均数为：" + Average);
				break;
			case "Max":
				int Max = scoreImplements.getMax(a);
				System.out.println("输入最大值为：" + Max);
				break;
			case "Min":
				int Min = scoreImplements.getMin(a);
				System.out.println("输入最小值为：" + Min);
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
		System.out.println("感谢此次使用，再见！");
	}
}
