package zuoye;

/**
 * @author ���� E-mail:738348954@qq.com
 * @date ����ʱ�䣺2017��11��18�� ����1:13:49
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class zuoye4 {
	public static void main(String[] args) {
		System.out.println("�����⣺1000����8�ı���֮��");
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 8 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}