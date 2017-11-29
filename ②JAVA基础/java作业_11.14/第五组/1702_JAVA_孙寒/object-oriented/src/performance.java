import java.util.Scanner;


public class performance {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("请输入一个学生的成绩");
		int score=Sc.nextInt();
		System.out.println("你输入学生的成绩是:"+score);
		if(score>=90){
			System.out.println("该同学的等级是:A");
			
		}if((score<=89)&&(score>=60)){
			System.out.println("该同学的等级是:B");
			
		}if(score<60){
			System.out.println("该同学的等级是:C");
			
		}boolean math =(score>=60)?true:false;
		System.out.println(math);
		
		
	}

}
