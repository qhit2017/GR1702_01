import java.util.Scanner;

public class Work2 {

	static String decimalToHex(int a) {

		String hex = "";

		while (a != 0) {

			int hexValue = a % 16;
			hex = decimalToChar(hexValue) + hex;
			a = a / 16;
		}

		return hex;
	}

	static char decimalToChar(int b) {

		if (b >= 0 && b <= 9) {

			return (char) (b + '0');
		} else {
			return (char) (b - 10 + 'A');
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个10~99的整数:");
		int a = sc.nextInt();

		System.out.println(decimalToHex(a));
		sc.close();
	}
}
