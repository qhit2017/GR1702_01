package Sunday;

/*�����ˣ�����
 *����ʱ�䣺2017��11��19������4:43:13
 *���䣺2408368509@qq.com
 */

public class ba {
	public static void main(String[] args) {
		// ���λ��Ϊ6���ܱ�3������3λ�������ж���
		int a = 0;
		for (int i = 100; i <= 999; i++) {
			if (i % 10 == 6 && i % 3 == 0) {
				a++;
			}
		}
		System.out.println(a);
	}

}
