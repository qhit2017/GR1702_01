package Grade;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//int[] a = {23,32,15,89,98,37,95,45,58,99};
		int[] a=new int[10];
		Manage manage = new Manage();
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("�������"+(i+1)+"��ͬѧ�ĳɼ���");
			a[i] = sc.nextInt();
			
		}
		boolean isQuit = true;
		
		String s;
		
		manage.help();
		while(isQuit){
			
			System.out.println("������������س�����");
			
			s = sc.next();
			switch (s) {
			case "sum":
		
				System.out.println("���ǵĺ�Ϊ:"+manage.getSum(a));
				
				break;
			case "mean":
				
				System.out.println("���ǵ�ƽ��ֵ��:"+manage.getMean(a));
				
				break;
			case "max":
				
				System.out.println("�������ֵΪ:"+manage.getMax(a));
				break;
			case "min":
				
				System.out.println("������СֵΪ��"+manage.getMin(a));
				break;
			case "not":
				
				System.out.println("�����������Ϊ:"+manage.getNot(a)+"��");
				break;
			case "info":
				System.out.println("���Ƴɼ�Ϊ:");
				manage.info(a);
				break;
			case "sort":
				System.out.println("����������Ϊ:");
				manage.Sort(a);
				break;
			case "Quit":
				isQuit = false;
	
				break;

			default:
				break;
			}
			
		}
		
		System.out.println("�ݰݣ�");
		
	}

}
