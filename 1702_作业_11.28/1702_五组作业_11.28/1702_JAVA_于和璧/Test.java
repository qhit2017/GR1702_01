package Grade;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//int[] a = {23,32,15,89,98,37,95,45,58,99};
		int[] a=new int[10];
		Manage manage = new Manage();
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入第"+(i+1)+"名同学的成绩！");
			a[i] = sc.nextInt();
			
		}
		boolean isQuit = true;
		
		String s;
		
		manage.help();
		while(isQuit){
			
			System.out.println("请输入命令并按回车键！");
			
			s = sc.next();
			switch (s) {
			case "sum":
		
				System.out.println("它们的和为:"+manage.getSum(a));
				
				break;
			case "mean":
				
				System.out.println("它们的平均值是:"+manage.getMean(a));
				
				break;
			case "max":
				
				System.out.println("其中最大值为:"+manage.getMax(a));
				break;
			case "min":
				
				System.out.println("其中最小值为："+manage.getMin(a));
				break;
			case "not":
				
				System.out.println("不及格的人数为:"+manage.getNot(a)+"人");
				break;
			case "info":
				System.out.println("各科成绩为:");
				manage.info(a);
				break;
			case "sort":
				System.out.println("按升序排序为:");
				manage.Sort(a);
				break;
			case "Quit":
				isQuit = false;
	
				break;

			default:
				break;
			}
			
		}
		
		System.out.println("拜拜！");
		
	}

}
