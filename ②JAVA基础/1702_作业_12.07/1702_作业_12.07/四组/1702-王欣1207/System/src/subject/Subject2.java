package subject;

/*�����ˣ�����
 *����2017��12��6��ʱ������7:01:26
 *����:2408368509@qq.com
 */

public class Subject2 {
	// ��д������ 1+3+5+7+����+99 �ĺ�ֵ��
	public static void main(String[] args) {
		System.out.println("1+3+5+7+......+99��ֵ�ǣ�");
		int sum = 0;
		for (int i = 1; i <= 99; i = i + 2) {
			sum += i;
		}
		System.out.println(sum);
	}

}
