package Sunday;

/*�����ˣ�����
 *����ʱ�䣺2017��11��19������4:04:42
 *���䣺2408368509@qq.com
 */

public class si {
	public static void main(String[] args) {
		// ��1000��������8�ı���֮��
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 8 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
