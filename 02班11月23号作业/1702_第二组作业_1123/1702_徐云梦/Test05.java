/**
 * 
 */

/**
 * @author ���� :xuyunmeng
 * @date ����ʱ�䣺2017��11��23�� ����8:53:33
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test05 {
	public static void main(String[] args) {
		// while���ַ�������1~100֮�������ĺ�

		int a = 0;
		int sum = 0;
		while (a <= 100) {
			if (a % 2 != 0) {

				sum = sum + a;
			}
			a++;
		}
		System.out.println(sum);

		// for���ַ�������1~100֮�������ĺ�

		int sam = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				sam = sam + i;
			}
		}
		System.out.println(sam);
	}

}
