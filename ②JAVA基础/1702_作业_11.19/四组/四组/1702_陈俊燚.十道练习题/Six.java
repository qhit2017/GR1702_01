package chenjunyi;

//1��10֮���������ӣ��õ��ۼ�ֵ����20�ĵ�ǰ���֣�����ӡ����
//ʹ��do whileѭ��ʵ��
public class Six {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		do {
			b += a;
			if (b > 20) {
				System.out.println(b);
				break;
			}

			a++;
		} while (a <= 10);
	}
}
