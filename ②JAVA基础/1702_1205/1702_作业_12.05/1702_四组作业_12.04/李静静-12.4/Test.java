package lijingjing;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		ArrayList<TongXun> arrayList = new ArrayList<TongXun>();
		TongXunService tongXunService = new TongXunService();
		Scanner sc = new Scanner(System.in);
		tongXunService.helpInfo();
		int key = 0;
		boolean isQuit = true;
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("��������Ϣ");
				tongXunService.addTongXun(arrayList, sc);
				break;
			case 2:
				tongXunService.InFoTongXun(arrayList);
				break;
			case 3:
				System.out.println("��������Ҫ���ҵ�����");
				String name = sc.next();
				tongXunService.findbyname(arrayList, name, sc);
				break;
			case 4:
				System.out.println("��������Ҫ���ҵ��Ա�");
				String xingbie = sc.next();
				tongXunService.findbyxingbie(arrayList, xingbie, sc);
				break;
			case 5:
				System.out.println("��������Ҫ���ҵĺ���");
				String dianhua = sc.next();
				tongXunService.findbydianhua(arrayList, dianhua, sc);
				break;
			case 6:
				isQuit = false;
				break;
			default:
				System.out.println("�������ָ������");
				break;
			}
		}System.out.println("�˳��ɹ�");
	}
}
