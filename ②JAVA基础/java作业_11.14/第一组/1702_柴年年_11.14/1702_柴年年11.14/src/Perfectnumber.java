/**
 * @author ���� E-mail:1603559382@qq.com
 * @date ����ʱ�䣺2017��11��13�� ����9:16:59
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Perfectnumber {

	public static void main(String[] args) {
		// һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "��
		// ����6=1��2��3.����ҳ�1000���ڵ�����������
		for (int a = 1; a <= 1000; a++) {
			int b = 0;
			for (int j = 1; j < a; j++) {
				if (a % j == 0) {
					b = b + j;
				}
			}
			if (b == a) {
				System.out.println(a + "Ϊ����");
			}
		}
		System.out.println();
	}
}
