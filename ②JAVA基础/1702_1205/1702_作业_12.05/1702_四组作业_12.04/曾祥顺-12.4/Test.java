package zengxiangshun;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2004��1��5�� ����5:27:19 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService cService = new ContactsService();
		Scanner sc = new Scanner(System.in);
		cService.hellp();
		boolean is = true;
		while (is) {
			int key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("��������Ϣ");
				cService.add(arrayList, sc);
				
				break;
			case 2:
				System.out.println("���±���¼���������Ϣ");
				cService.info(arrayList);
				break;
			case 3:
				System.out.println("����������");
				cService.find(arrayList, "����", sc);
				break;
			case 4:
				System.out.println("�������Ա�");
				cService.find(arrayList, "�Ա�", sc);
				break;
			case 5:
				System.out.println("������绰");
				cService.find(arrayList, "�绰", sc);
				break;
			case 6:
				is = false;
				break;

			default:
				System.out.println("�����������1~6����");
				break;
			}
		}
	}
}
