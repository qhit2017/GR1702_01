import java.util.Scanner;


public class Judge {
     public static void main(String[] args) {
		//������
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("����һ��5λ��");
    	 int t = sc.nextInt();
    	 
    	if(t/10000==t%10 && t/1000%10==t/10%10 ){
    		System.out.println(t+"�����ǻ�����");
    			
    		}else{
    			System.out.println(t+"�������ǻ�����:");
    			
    		}
    	
    	
	}
}
                                                                                                                                                                                                                                                                      