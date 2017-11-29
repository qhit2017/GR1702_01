public class Eight {
	public static void main(String[] args) {
		//第八题
		int e = 0;
		int p = 100;
		while (p >= 100 && p < 1000) {
			if (p % 10 == 6 && p % 3 == 0) {
				System.out.println("个位数是6且能被3整除的3位整数是:" + p);
				e++;
			}
			p++;
		}
		System.out.println("总共有" + e + "个");
	}
}
