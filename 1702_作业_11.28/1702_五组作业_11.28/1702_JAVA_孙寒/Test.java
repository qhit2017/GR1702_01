import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		ScoreImplements  scoreImplements=new ScoreImplements();
		boolean isQuit=true;
		String s;
		scoreImplements.help();
		int[] a={54,74,62,87,67,79,49,93,83,29};
		while (isQuit) {
			System.out.println("请输入命令并回车");
			s=sc.next();
			
			switch (s) {
			case "sum":
			System.out.println("和为:"+scoreImplements.getSum(a));	
				
				break;

			case "Average":
				System.out.println("平均值为:"+scoreImplements.getAverage(a));	
					
					break;

			case "max":
				System.out.println("最大值为:"+scoreImplements.getmax(a));	
					
					break;
	
			case "min":
				System.out.println("最小值为:"+scoreImplements.getmin(a));	
					
					break;			
			case "not":
				System.out.println("不及格人数为:"+scoreImplements. getNot(a)+"人");	
					
					break;
			case "info":

				scoreImplements.info(a);
					
					break;		
			case "sort":
				scoreImplements.getSort(a);
					
					break;					
			case "Quit":
				isQuit=false;
					
					break;			
			}
			
		}
		System.out.println("结束");
	}

}
