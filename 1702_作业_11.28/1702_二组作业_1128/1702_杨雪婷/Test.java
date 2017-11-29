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
			System.out.println("请输入你要执行的命令，并按回车键");
			s=sc.next();
		
		switch (s){ 
		
		case "Sum":
			
			System.out.println("总成绩是:"+scoreMan.getSum(a));
			break;
		case "Average":
			System.out.println("平均值是:"+scoreMan.getAverage(a));
		
			break;
		case "Not":
			System.out.println("不及格的人数是:"+scoreMan.getNot60(a));
		
			break;
		case "Max":
			System.out.println("最大值是:"+scoreMan.getMax(a));
			
			break;
		case "Min":
			System.out.println("最小值是:"+scoreMan.getMin(a));
			
	break;

		default:
			break;
		}	
		sc.close();
		}
	}
	}
