package Sunday;

/*�����ˣ�����
 *����ʱ�䣺2017��11��19������4:14:31
 *���䣺2408368509@qq.com
 */

public class wu {
	public static void main(String[] args) {
		// ��1000���ڼ��ܱ�5�������ܱ�3��������������
		// ����ӡ����ʹ��do while ѭ��
		int i = 1;
		do {

			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 1000);

	}

}
