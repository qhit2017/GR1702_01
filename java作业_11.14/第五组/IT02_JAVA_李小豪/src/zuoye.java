import java.util.Scanner;


public class zuoye {
public static void main(String[] args) {
	
			
		   Scanner sc = new Scanner(System.in);
			   
			System.out.println("������ѧ���ɼ�:");
			
			int result =sc.nextInt();
			
			if(result>=90){
				System.out.println("��ͬѧ�ȼ�ΪA");
			}
			if(result>=60 && result<=89){
				System.out.println("��ͬѧ�ȼ�ΪB");
			}
			if(result<60){
				System.out.println("��ͬѧ�ȼ�ΪC");
			}
			sc.close();
			
			
		}
		   
		
		   

	}



