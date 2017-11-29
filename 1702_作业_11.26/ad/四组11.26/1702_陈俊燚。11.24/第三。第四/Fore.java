// 请输出0~10000之间以3开头的数
public class Fore {
	public static void main(String[] args) {
		for (int a = 1; a <= 10000; a++) {
			if (a == 3 || a / 10 == 3 || a / 100 == 3 || a / 1000 == 3) {
				System.out.print(a);
			}
		}
	}
}
