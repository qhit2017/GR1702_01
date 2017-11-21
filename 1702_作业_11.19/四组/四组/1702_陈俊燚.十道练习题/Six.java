package chenjunyi;

//1到10之间的整数相加，得到累加值大于20的当前数字，并打印出来
//使用do while循环实现
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
