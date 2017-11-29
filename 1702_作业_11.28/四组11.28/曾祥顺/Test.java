import java.util.Scanner;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2017年11月27日 下午4:40:46
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {
	public static void main(String[] args) {
	int[] a={2,8,5,4,8,7,6,7,8,4};
		Scanner sc = new Scanner(System.in);
		
		
		Boos b = new Boos();
		b.help();
		int f = sc.nextInt();
		switch (f) {
		case 1:
			int sum=b.sum(a);
			System.out.println(sum);
			break;
		case 2:
			int min=b.Average(a);
			System.out.println(min);
			break;
		case 3:
			int[] s=b.sort(a);
			System.out.println(s);
			break;
		case 4:
			b.info(a);
			break;
		case 5:
			int s2=b.getNot60(a);
			System.out.println(s2);
			break;

		default:
			break;
		}
	}
}
