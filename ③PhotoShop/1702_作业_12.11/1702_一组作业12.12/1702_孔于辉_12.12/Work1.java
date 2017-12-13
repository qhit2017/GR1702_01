import java.util.Arrays;
import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];

		for (int i = 0; i < a.length; i++) {
			System.out.println("ÇëÊäÈë" + (i + 1) + "¸öÊý");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		sc.close();
	}

}
