package kaoshi3;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��12��6�� ����7:15:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();
		CommodityService a = new CommodityService();
		Scanner sc = new Scanner(System.in);
		a.hellp();
		boolean is = true;
		while (is) {
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("���������ӵ���Ʒ");
				a.add(arrayList, sc);
				break;
			case 2:
				
				a.add1(arrayList, sc);
				break;
			case 3:
				
				a.remove(arrayList, sc);
				break;
			case 4:
				System.out.println("���");
				a.info(arrayList);
				break;
			case 5:
				is = false;
				break;

			default:
				System.out.println("����");
				break;
			}
			
		}
		System.out.println("�ݰ�");
	}
}
