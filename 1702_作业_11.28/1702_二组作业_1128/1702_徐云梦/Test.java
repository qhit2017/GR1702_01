import java.util.Scanner;

/**
 * 
 */

/**
 * @author 作者 :xuyunmeng
 * @date 创建时间：2017年11月27日 下午4:29:27
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
			System.out.println("请输入第"+(i+1)+"个数");
			a[i] = sct.nextInt();
		} 
		
		//int[] a = { 25, 89, 96, 68, 77, 56, 78, 99, 12, 71 };
		Scanner sc = new Scanner(System.in);
		ScoreTest scoreTest = new ScoreTest();
		boolean isQuit = true;
		String s;
		scoreTest.help();

		while (isQuit) {
			System.out.println("请输入你要执行的指令，并按回车键");
			s = sc.next();
			switch (s) {
			case "Average":
				int average = scoreTest.getAverage(a);
				System.out.println("平均分是"+average);
				break;
				
			case "Sum":
				int sum = scoreTest.getSum(a);
				System.out.println("总分是"+sum);
				break;
				
			case "Max":
				int max = scoreTest.getMax(a);
				System.out.println("最大值是"+max);
				break;
				
			case "Min":
				int min = scoreTest.getMin(a);
				System.out.println("最小值是"+min);
				break;
				
			case "Not":
				int not = scoreTest.getNot(a);
				System.out.println("不及格人数是"+not);
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
		System.out.println("再见");
	}

}
