import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��25�� ����12:26:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		if (a>=100||a<=999) {
			b=a/10%10;
			System.out.println(b);
		} else {
			System.out.println("�ⲻ��һ����λ��");

		}
		sc.close();
	}

}
