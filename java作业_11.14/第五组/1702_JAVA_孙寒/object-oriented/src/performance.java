import java.util.Scanner;


public class performance {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("������һ��ѧ���ĳɼ�");
		int score=Sc.nextInt();
		System.out.println("������ѧ���ĳɼ���:"+score);
		if(score>=90){
			System.out.println("��ͬѧ�ĵȼ���:A");
			
		}if((score<=89)&&(score>=60)){
			System.out.println("��ͬѧ�ĵȼ���:B");
			
		}if(score<60){
			System.out.println("��ͬѧ�ĵȼ���:C");
			
		}boolean math =(score>=60)?true:false;
		System.out.println(math);
		
		
	}

}
