package lijingjing;

import java.util.Scanner;
 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月27日 下午4:29:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {58,66,79,89,22,99,65,36,95,77};
		Scanner sc = new Scanner(System.in);
		ScoreShiXian scoreShixian = new ScoreShiXian();
		boolean isQuit = true;
		scoreShixian.help();
		String s =sc.next();
		switch (s) {
		case "Average":
			int Average = scoreShixian.getAverage(a);
			System.out.println("求平均分是"+Average);
			break;
		case "Sum":
			int Sum = scoreShixian.getSum(a);
			System.out.println("求总分是"+Sum);
			break;
		case "Info":
			scoreShixian.info(a);
			break;
		case "max":
			int max = scoreShixian.getMax(a);
			System.out.println("最高分:" + max);
			break;
		case "min":
			int min = scoreShixian.getMin(a);
			System.out.println("最低分:" + min);
			break;
		
		case "Not60":
			int Not60 = scoreShixian.getNot(a);
			System.out.println("求不及格人数是"+Not60);
			break;
		default:
			break;
		}
		System.out.println("退出");
		sc.close();
	}

	}


