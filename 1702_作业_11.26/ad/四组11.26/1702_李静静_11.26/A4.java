package lijingjing;

/**
 * @author ���� E-mail:996939518@qq.com
 * @date ����ʱ�䣺2017��11��26�� ����8:31:45
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class A4 {

	public static void main(String[] args) {
		for (int i = 0; i <= 10000; i++) {
			if (i == 3 || i / 10 == 3 || i / 100 == 3 || i / 1000 == 3) {
				System.out.println(i);
			}
		}
	}

}
