package Perfect_number;

/**
 * @author ���� E-mail:������271406@163.com
 * @date ����ʱ�䣺2017��11��14�� ����9:36:19
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */

public class Perfect_number {
	public static void main(String[] args) {

		// һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "��
		// ����6=1��2��3.
		// ����ҳ�1000���ڵ�����������

		for (int i = 1; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++)
				if (i % j == 0)
					sum += j;
			if (sum == i)
				System.out.println(i);

		}
	}

}
