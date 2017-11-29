import java.util.Scanner;

public class ChengJi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入同学的成绩");
		int study = sc.nextInt();
		boolean w = false;
		w = (study >= 90) ? true : false;
		System.out.println("w的值是:" + w);
		if (w) {
			System.out.println("表示为:A");
		} else if (w = (study >= 60) ? true : false) {
			System.out.println("表示为:B");
		} else if (w = (study < 60) ? true : false) {
			System.out.println("表示为:C");
		}
	}
}
