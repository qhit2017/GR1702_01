package zk.qhit.smc;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<AddressBook> arrayList = new ArrayList<AddressBook>();
		Arrays a = new Arrays();
		Scanner sc = new Scanner(System.in);
		boolean isQuit = true;
		int key = 0;
		a.help();
		while (isQuit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("��������Ҫ¼�����Ϣ�磺����,Ů,13568794530");
				a.addAddressBook(arrayList, sc);
				break;
			case 2:
				a.findByNameSexNum(arrayList, "����", sc);
				break;
			case 3:
				a.findByNameSexNum(arrayList, "�Ա�", sc);
				break;
			case 4:
				a.findByNameSexNum(arrayList, "�绰", sc);
				break;
			case 5:
				a.infoAddressBook(arrayList);
				break;
			case 6:
				isQuit = false;
				break;
			default:
				break;
			}
		}
		System.out.println("�˳�ϵͳ");
	}
}
