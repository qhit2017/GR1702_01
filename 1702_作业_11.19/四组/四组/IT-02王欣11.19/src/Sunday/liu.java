package Sunday;

/*�����ˣ�����
 *����ʱ�䣺2017��11��19������4:25:35
 *���䣺2408368509@qq.com
 */

public class liu {
	public static void main(String[] args) {
		// 1~10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ���֣������������
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (sum > 20) {
				System.out.println(i);
				break;
			}
		}
	}

}
