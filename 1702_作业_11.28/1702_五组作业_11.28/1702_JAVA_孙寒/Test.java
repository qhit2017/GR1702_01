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
			System.out.println("����������س�");
			s=sc.next();
			
			switch (s) {
			case "sum":
			System.out.println("��Ϊ:"+scoreImplements.getSum(a));	
				
				break;

			case "Average":
				System.out.println("ƽ��ֵΪ:"+scoreImplements.getAverage(a));	
					
					break;

			case "max":
				System.out.println("���ֵΪ:"+scoreImplements.getmax(a));	
					
					break;
	
			case "min":
				System.out.println("��СֵΪ:"+scoreImplements.getmin(a));	
					
					break;			
			case "not":
				System.out.println("����������Ϊ:"+scoreImplements. getNot(a)+"��");	
					
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
		System.out.println("����");
	}

}
