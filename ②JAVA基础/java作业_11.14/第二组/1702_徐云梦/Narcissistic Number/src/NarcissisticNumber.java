/**
 * @author ����:
 * @date ����ʱ�䣺2017��11��8�� ����7:05:30
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class NarcissisticNumber {
	public static void main(String[] args) {
		// д��100��1000�����е�ˮ�ɻ���
		int hundreds = 0;
		int tens = 0;
		int units = 0;
		for (int a = 100; a <= 1000; a++) {
			// �ֱ�д�����ǵĸ�λʮλ��λ
			hundreds = a / 100;
			tens = a / 10 % 10;
			units = a % 10;
			if (a == hundreds * hundreds * hundreds + tens * tens * tens
					+ units * units * units) {
				System.out.println("ˮ�ɻ��� " + a);
			}

		}
	}
}
