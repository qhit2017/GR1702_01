import java.util.Scanner;

/**
 * 
 */

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��21�� ����11:34:00 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Four {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ����λ��");
		int a = sc.nextInt();
		if(a%10==a/10000 && a/10%10==a/1000%10){
			System.out.println("�ǻ�����");
		}else{
			System.out.println("���ǻ�����");
		}
		
	}
}
