import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��25�� ����12:16:58 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������С��");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if (a==b) {
			
			System.out.println("�����������");
			
		}else{
			
			System.out.println("�������������");
		}
		sc.close();
	}
}
