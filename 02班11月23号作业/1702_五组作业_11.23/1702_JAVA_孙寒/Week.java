import java.util.Scanner;


public class Week {
	public static void main(String[] args) {
		int num=0;
		String day="";
		Scanner a = new Scanner(System.in);
		System.out.println("��������1��7(����0����):");
		num=a.nextInt();
		do {
			switch (num) {
			case 0:
				break;
				
			case 1:
				day="����������һ";
				System.out.println(day);
				break;
			case 2:
				day="���������ڶ�";
				System.out.println(day);
				break;
			case 3:
				day="������������";
				System.out.println(day);
				break;
			case 4:
				day="������������";
				System.out.println(day);
				break;
			case 5:
				day="������������";
				System.out.println(day);
				break;
			case 6:
				day="������������";
				System.out.println(day);
				break;
			case 7:
				day="������������";
				System.out.println(day);
				break;
			default:
				System.out.println("����������,");
				break;
			}
			num=a.nextInt();
		} while (num!=0);
		
	}

	
}
