import java.util.Scanner;

/**
 * 
 */

/** 
 * @author  ���� :xuyunmeng
 * @date    ����ʱ�䣺2017��11��20�� ����7:58:49 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Three {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������������");
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int a;

			if (y < x) {
				a = x;
				x = y;
				y = a;

			}
			if (z< x) {
				a = x;
				x = z;
				z = a;

			} 
			if (z < y) {
				a = y;
				y = z;
				z = a;

				
			}
			System.out.println("��С�����˳����" + x + "<" + y + "<" + z);

		}
		
}
