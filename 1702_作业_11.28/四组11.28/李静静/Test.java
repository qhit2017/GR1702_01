package lijingjing;

import java.util.Scanner;
 /**
 *@author  ���� E-mail:996939518@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:29:32 
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
			System.out.println("��ƽ������"+Average);
			break;
		case "Sum":
			int Sum = scoreShixian.getSum(a);
			System.out.println("���ܷ���"+Sum);
			break;
		case "Info":
			scoreShixian.info(a);
			break;
		case "max":
			int max = scoreShixian.getMax(a);
			System.out.println("��߷�:" + max);
			break;
		case "min":
			int min = scoreShixian.getMin(a);
			System.out.println("��ͷ�:" + min);
			break;
		
		case "Not60":
			int Not60 = scoreShixian.getNot(a);
			System.out.println("�󲻼���������"+Not60);
			break;
		default:
			break;
		}
		System.out.println("�˳�");
		sc.close();
	}

	}


