package chenjunyi;

public class Fore {
	// ���һǧ�����а˵ı���֮��
	public static void main(String[] args) {
		int a = 0;
		for (int s = 1; s <= 1000; s++) {
			if (s % 8 == 0) {
				System.out.println(s);
				a = a + s;
			}
		}
		System.out.println(a);
	}
}