package N1;

/*�����ˣ�����
 *����ʱ�䣺2017��11��13������8:13:24
 *���䣺2408368509@qq.com
 */

public class N4 {
	public static void main(String[] args) {
		// ����ҳ�1000���ڵ���������
		// һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "
		// ����6=1��2��3

		for (int i = 1; i <= 1000; i++) {
			int s = 0;
			for (int j = 1; j < i; j++)

				if (i % j == 0)
					s += j;

			if (s == i)
				System.out.println(i);

		}
	}
}
