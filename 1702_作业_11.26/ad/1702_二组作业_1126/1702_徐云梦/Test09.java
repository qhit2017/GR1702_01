import java.util.Scanner;

/**
 * 
 */

/**
 * @author ���� :xuyunmeng
 * @date ����ʱ�䣺2017��11��26�� ����2:17:52
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ����");
		int a = sc.nextInt();
		int sum = 0;
		int sam = 0;
		if (a > 0 && a <= 1000) {
			if (a%2!=0) {
				for (int j = 0; j < a; j++) {
					if (j%2!=0) {
						sum=sum+j;
					}
				}
				System.out.println("��������������Ϊ"+sum);
			}
			if (a%2==0) {
				for (int k = 0; k < a; k++) {
					if (k%2==0) {
						sam=sam+k;
					}
				}
				System.out.println("������ż������Ϊ"+sam);
			}
		}else{
			System.out.println("���ڷ�Χ��");
		}
	}

}
