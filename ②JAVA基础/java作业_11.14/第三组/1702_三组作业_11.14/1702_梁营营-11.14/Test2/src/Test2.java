
public class Test2 {
	// ���ߣ���ӪӪ��
	public static void main(String[] args) {
		System.out.println("��ҵ�ģ�");
		System.out.println("\n");
		// ��ӡ��1000���ڵ�����������
		for (int i = 1; i <= 1000; i++) {
			int k = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					k = k + j;
				}
			}
			if (k == i) {

				System.out.println("1000���ڵ����������У�"+i);
			}
		}
	}
}