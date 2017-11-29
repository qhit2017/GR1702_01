package Sqare;

import java.util.Scanner;

/**
 * 制作者：陈亮亮 制作时间：2017年11月27日下午4:33:28 邮箱：2507147605@qq.com
 */
public class Test {

	

	public static void main(String[] args) {
		int[] a=new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"个数");
			a[i] =sc.nextInt();
		}
		
		IRealize realize = new IRealize();
		realize.help();
		boolean isQuit = true;
		String s;

		while (isQuit) {
			System.out.println("请输入你要执行的指令,并按回车键");
			s = sc.next();
			switch (s) {
			case "sum":
				int sum = realize.getsum(a);
				System.out.println("总分是" + sum);
				break;
			case "Average":
				int average = realize.getAverage(a);
				System.out.println("求平均分是" + average);
				break;

			case "Max":
				int Max=realize.getMax(a);
				System.out.println("求最大值"+ Max);
				break;
			case "Min":
				int Min =realize.getMin(a);
				System.out.println("求最小值"+ Min);
				

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
