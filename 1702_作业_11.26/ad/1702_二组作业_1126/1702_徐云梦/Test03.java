import java.util.Scanner;

/**
 * 
 */

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��26�� ����1:07:52 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��������10000������");
		int a =sc.nextInt();
		if (a<10) {
			System.out.println("һλ��");
		}else if (a<100) {
			System.out.println("��λ��");
		}else if (a<1000) {
			System.out.println("��λ��");
		}else if (a<10000) {
			System.out.println("��λ��");
		}
	}

}
