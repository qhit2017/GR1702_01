/**
 * 
 */

/**
 * @author ���� :xuyunmeng
 * @date ����ʱ�䣺2017��11��26�� ����2:13:45
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test08 {
	public static void main(String[] args) {
		for (int i = 0; i < 10000; i++) {
			if (i % 3 == 0 && i % 10 == 6) {
				System.out.println(i);
			}
		}

	}

}
