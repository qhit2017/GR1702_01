package shap02;

//请输出0~10000之间以3开头的数
public class ZuoYe04 {
	public static void main(String[] args) {

		for (int b = 1; b < 10000; b++) {
			if (b / 1000 == 3 || b / 100 == 3 || b / 10 == 3 || b == 3) {
				System.out.println(b);
			}
		}

	}
}
