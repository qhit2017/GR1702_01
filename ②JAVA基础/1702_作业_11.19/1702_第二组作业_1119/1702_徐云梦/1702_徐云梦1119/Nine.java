import java.util.Scanner;

/**
 * 
 */

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��19�� ����5:57:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Nine {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("����һ��������10000������");
			int a = sc.nextInt();
			if(a<=10000){
				for(int b = 1;b<a;b++){
					if(b%7==0||b%10==7||b%100==7||b%1000==7||b/10%10==7){
						System.out.println(b);
				}
				
			}
			sc.close();
			}
			
		}
}
