package zengxiangshun;



/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2017��11��16�� ����9:21:06
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Total {
	public static void main(String[] args) {
		// һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻
		// �����£������� ��10�����ʱ�������������ף���10�η�����ߣ�
		double a = 100;
		double b = a;
		for (int c = 1; c < 10; c++) {
			a = a / 2;
			if (c == 10) {
				b = b + a;
			} else {
				b = b + 2 * a;
			}
		}
		System.out.println("����" + b + "�ף�����" + a);
	}
}
