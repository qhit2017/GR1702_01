package shap02;

//�����0~10000֮����3��ͷ����
public class ZuoYe04 {
	public static void main(String[] args) {

		for (int b = 1; b < 10000; b++) {
			if (b / 1000 == 3 || b / 100 == 3 || b / 10 == 3 || b == 3) {
				System.out.println(b);
			}
		}

	}
}
