package lishaoqing345;

public class D4 {
	public static void main(String[] args) {
		// һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "������6=1��2��3.����ҳ�1000���ڵ�����������

		for (int a = 1; a <= 1000; a++) {
			int c = 0;
			for (int b = 1; b < a; b++) {
				if (a % b == 0) {
					c =c + b;
				}
			}
			if (c == a) {
				System.out.println(a);
			}
		}
	}
}
