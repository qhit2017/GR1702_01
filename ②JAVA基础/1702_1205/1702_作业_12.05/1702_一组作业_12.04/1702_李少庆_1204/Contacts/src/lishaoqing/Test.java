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
				System.out.println("��������Ҫ��ӵ���ϵ�ˣ����磺");
				System.out.println("marry,Ů,745645");
				contactsImplements.addContacts(arrayList, sc);
				break;
			case 2:
				contactsImplements.infoContacts(arrayList);
				break;
			case 3:
				contactsImplements.findByNameSexNum(arrayList, "����", sc);
				break;
			case 4:
				contactsImplements.findByNameSexNum(arrayList, "�Ա�", sc);
				break;
			case 5:
				contactsImplements.findByNameSexNum(arrayList, "����", sc);
				break;
			case 6:
				isExit=false;
				break;
			
			default:
				System.out.println("�Բ����������ָ����Ч");
				break;
			}
		}
		System.out.println("�ݰ�");
	}

}
