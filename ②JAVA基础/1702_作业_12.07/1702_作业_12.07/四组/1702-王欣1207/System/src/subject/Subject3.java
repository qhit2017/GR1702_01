package subject;

/*�����ˣ�����
 *����2017��12��6��ʱ������7:07:58
 *����:2408368509@qq.com
 */

public class Subject3 {
	// �ж�101-200֮���ж��ٸ����������������������
	// ������������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)��
	// ����ܱ������� ���������������������֮����������
	public static void main(String[] args) {
		System.out.println("������101����200֮������������");
		int count = 0;
		for (int i = 101; i < 200; i += 2) {
			boolean b = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					b = false;
					break;
				} else {
					b = true;
				}
			}
			if (b == true) {
				count++;
				System.out.println(i);
			}
		}
		System.out.println("���������ǣ�" + count);
	}
}
