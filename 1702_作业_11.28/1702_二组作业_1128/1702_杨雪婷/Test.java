package yangxueting;

import java.util.Scanner; 


public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int[] a={12,13,45,89,87,52,67,95,98,53};
		 boolean isQuit = true;
		 String s;
		
		 ScoreMan scoreMan =new ScoreMan();
		 
		 scoreMan.help();
		 
		while (isQuit) {
			System.out.println("��������Ҫִ�е���������س���");
			s=sc.next();
		
		switch (s){ 
		
		case "Sum":
			
			System.out.println("�ܳɼ���:"+scoreMan.getSum(a));
			break;
		case "Average":
			System.out.println("ƽ��ֵ��:"+scoreMan.getAverage(a));
		
			break;
		case "Not":
			System.out.println("�������������:"+scoreMan.getNot60(a));
		
			break;
		case "Max":
			System.out.println("���ֵ��:"+scoreMan.getMax(a));
			
			break;
		case "Min":
			System.out.println("��Сֵ��:"+scoreMan.getMin(a));
			
	break;

		default:
			break;
		}	
		sc.close();
		}
	}
	}
