package chenjunyi;

public class Fore {
	// 求出一千内所有八的倍数之和
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