package Score0;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		//double[] a = {54,88,87,28,76,56,97,34,87,35};
		double[] a=new double[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������"+(i+1)+"��������");
			a[i]=sc.nextDouble();
		}
		
		Score01 w=new Score01();
		w.help();
		boolean ss=true;
		
		while(ss){
			System.out.println("������ָ������س���");
		String q =sc.next();
		switch (q) {
		case "Sum":
			double i=w.getSum(a);
			System.out.println(i);
			break;
			
		case "Quit":
			ss=false;
			break;
		case "Average":
			double j=w.getAverage(a);
			System.out.println(j);
			break;
		case "Max":
			double k=w.Max(a);
			System.out.println(k);
			break;
		case "Min":
			double u=w.Min(a);
			System.out.println(u);
			break;
		case "Not":
			w.Not60(a);
			break;
		case "Info":
			w.info(a);
			break;
		case "Sort":
			w.sort(a);
		default:
			break;
		}
		
	}
		System.out.println("�ݰݣ��ҵ����ѣ�");
	}
}
