//4 �����0~10000֮����3��ͷ����
public class Test04 {
	public static void main(String[] args) {
		for (int a = 1; a <= 10000; a++) {
			if (a == 3 || a / 10 == 3 || a / 100 == 3 || a / 1000 == 3) {
				System.out.println("��3��ͷ����:" + a);
			}
		}
	}
}
