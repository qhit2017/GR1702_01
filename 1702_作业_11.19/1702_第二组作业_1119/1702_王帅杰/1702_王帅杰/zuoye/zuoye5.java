package zuoye;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��18�� ����1:35:43
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class zuoye5 {
	public static void main(String[] args) {
		System.out.println("�����⣺1000���ڼ��ܱ�3�������ܱ�5��������");
		int a = 1;
		do {
			if (a % 3 == 0 && a % 5 == 0) {
				System.out.println(a);
			}
			a++;
		} while (a <= 1000);
	}
}
