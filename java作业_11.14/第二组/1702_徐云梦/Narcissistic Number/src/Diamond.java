/**
 * @author ����: xuyunmeng
 * @date ����ʱ�䣺2017��11��8�� ����7:03:13
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Diamond {
	public static void main(String[] args) {
		
		for (int a = 1; a <= 10; a++) {
			for (int b = 9; b >= a; b--) {
			System.out.print("+");
			}
			for (int b = 1; b <= a; a++) {
				System.out.print("*");
			}
			for (int b = 1; b < a; a++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(" ");
			
			}
			for (int b = 9; b >=a; b--) {
				System.out.print("*");
			}
			for (int b = 9; b >a; b--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
