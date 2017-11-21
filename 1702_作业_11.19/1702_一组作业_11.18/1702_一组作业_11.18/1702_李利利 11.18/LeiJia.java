public class LeiJia {
	public static void main(String[] args) {
		// 第六题
		int p = 0;
		int sum = 0;

		while (p <= 10) {
			sum = sum + p;
			if (sum > 20) {

				System.out.println("输出累加值大于20的当前数字是:" + p);
				break;
			}
			p++;
		}
	}
}
