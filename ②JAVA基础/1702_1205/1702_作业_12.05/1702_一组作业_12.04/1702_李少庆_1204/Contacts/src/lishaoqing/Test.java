package lishaoqing;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Contacts> arrayList=new ArrayList<Contacts>();
		ContactsImplements contactsImplements=new ContactsImplements();
		Scanner sc=new Scanner(System.in);
		contactsImplements.help();
		int key;
		boolean isExit=true;
		while (isExit) {
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("请输入您要添加的联系人，例如：");
				System.out.println("marry,女,745645");
				contactsImplements.addContacts(arrayList, sc);
				break;
			case 2:
				contactsImplements.infoContacts(arrayList);
				break;
			case 3:
				contactsImplements.findByNameSexNum(arrayList, "姓名", sc);
				break;
			case 4:
				contactsImplements.findByNameSexNum(arrayList, "性别", sc);
				break;
			case 5:
				contactsImplements.findByNameSexNum(arrayList, "号码", sc);
				break;
			case 6:
				isExit=false;
				break;
			
			default:
				System.out.println("对不起，您输入的指令无效");
				break;
			}
		}
		System.out.println("拜拜");
	}

}
