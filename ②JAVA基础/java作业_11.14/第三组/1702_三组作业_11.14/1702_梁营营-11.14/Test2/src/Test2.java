
public class Test2 {
	// 作者：梁营营；
	public static void main(String[] args) {
		System.out.println("作业四：");
		System.out.println("\n");
		// 打印出1000以内的所有完数；
		for (int i = 1; i <= 1000; i++) {
			int k = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					k = k + j;
				}
			}
			if (k == i) {

				System.out.println("1000以内的所有完数有："+i);
			}
		}
	}
}