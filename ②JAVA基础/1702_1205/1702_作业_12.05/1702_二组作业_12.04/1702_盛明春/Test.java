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
				System.out.println("请输入你要录入的信息如：美琪,女,13568794530");
				a.addAddressBook(arrayList, sc);
				break;
			case 2:
				a.findByNameSexNum(arrayList, "姓名", sc);
				break;
			case 3:
				a.findByNameSexNum(arrayList, "性别", sc);
				break;
			case 4:
				a.findByNameSexNum(arrayList, "电话", sc);
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
		System.out.println("退出系统");
	}
}
