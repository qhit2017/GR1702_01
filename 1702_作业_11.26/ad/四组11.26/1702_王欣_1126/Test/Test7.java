package Test;

/*�����ˣ�����
 *����ʱ�䣺2017��11��26������6:33:21
 *���䣺2408368509@qq.com
 */

public class Test7 {
	public static void main(String[] args) {
		// ��1000���ڣ����ܱ�5������ͬʱ���ܱ�10��������������������ӡ����
		int i = 1;

		while (i <= 1000) {
			if (i % 5 == 0 && i % 10 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
