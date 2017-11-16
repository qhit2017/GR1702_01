import java.util.Scanner;


public class zuoye {
public static void main(String[] args) {
	
			
		   Scanner sc = new Scanner(System.in);
			   
			System.out.println("请输入学生成绩:");
			
			int result =sc.nextInt();
			
			if(result>=90){
				System.out.println("该同学等级为A");
			}
			if(result>=60 && result<=89){
				System.out.println("该同学等级为B");
			}
			if(result<60){
				System.out.println("该同学等级为C");
			}
			sc.close();
			
			
		}
		   
		
		   

	}



