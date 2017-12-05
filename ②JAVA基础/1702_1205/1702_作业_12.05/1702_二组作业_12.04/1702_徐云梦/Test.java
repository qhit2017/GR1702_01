package qhit.xym;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		ContactsService cService = new ContactsService();
		Scanner sc = new Scanner(System.in);
		boolean isQuit = true;
		int a;
		cService.help();
		while (isQuit) {
			a = sc.nextInt();
			switch (a) {
			case 1:
				cService.addContacts(arrayList, sc);
				break;
			case 2:
				cService.infoContacts(arrayList);
				break;
			case 3:
				String name = sc.next();
				cService.findName(arrayList, name);
				break;
			case 4:
				String sex = sc.next();
				cService.findSex(arrayList, sex);
				break;
			case 5:
				String telnum = sc.next();
				cService.findTelnum(arrayList, telnum);
				break;
			case 6:
				isQuit = false;
				break;
			default:
				break;
			}
		}
		System.out.println("ÔÙ¼û£¡£¡£¡");
	}

}
