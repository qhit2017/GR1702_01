import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��25�� ����12:35:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Word3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	int b = 0;
	if (i>0||i<10000) {
		for (int a=i ;a>0; a=a/10) {
			b++;
		}
		System.out.println("����"+b+"λ��");
	} else {
		System.out.println("�������");
		sc.close();

	}
}
}
