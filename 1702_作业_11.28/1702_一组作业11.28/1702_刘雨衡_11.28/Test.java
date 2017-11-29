package lyh;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner sor = new Scanner(System.in);
		int[] a= new int[10] ;
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("请输入第"+(i+1)+"学生成绩：");
			a[i]= sor.nextInt();
		}
		ScoreImplment sc = new ScoreImplment();
		sc.help();

		String a2;
		boolean isQuit = true;
		while (isQuit) {
			System.out.println("请输入命令并按Enter键：");

			a2 = sor.next();

			switch (a2) {

			case "Sum":
				int sum = sc.getSum(a);
				System.out.println("总分是" + sum);
				break;

			case "Average":
				int Average = sc.getAverage(a);
				System.out.println("总分是" + Average);
				break;

			case "sort":
				sc.sort(a);
				break;

			case "Not60":
				int Not = sc.getNot60(a);
				System.out.println("不及格人数有" + Not + "个");
				break;

			case "Max":
				int max = sc.getMax(a);
				System.out.println("最大值是：" + max);
				break;

			case "Min":
				int Min = sc.getMin(a);
				System.out.println("最小值是：" + Min);
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
		System.out.println("再见！");
		sor.close();
	}

}
