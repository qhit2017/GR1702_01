/**
 * @author ���� E-mail:1243629747@163.com
 * @date ����ʱ�䣺2017��11��14�� ����6:26:07
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/*
 * 4��һ�������ǡ�õ�����������֮��,
 * ������ͳ�Ϊ "���� "������6=1��2��3.
 *  ����ҳ�1000���ڵ�����������
 */
public class Number {
	public static void main(String[] args) {
		System.out.println("������:");
		for (int a = 1; a <= 1000; a++) {
		int sum = 0;
			for (int b = 1; b < a; b++)
				if (a % b == 0)
					sum += b;
				if (sum == a)
				System.out.println("1000���ڵ���������"+a);
		}
	}
}
