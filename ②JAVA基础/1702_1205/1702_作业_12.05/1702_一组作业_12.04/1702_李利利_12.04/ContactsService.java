import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactsService implements IContactsBook {

	public void helpInfo() {
		System.out.println("------ͨѶ��Ϣ���Ұ���------");
		System.out.println("1. ���ͨѶ��Ϣ");
		System.out.println("2. ���ͨѶ¼");
		System.out.println("3. ����������Ϣ");
		System.out.println("4. �Ա������Ϣ");
		System.out.println("5. �绰���������Ϣ");
		System.out.println("6. �˳�ͨѶ¼");

	}

	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s = sc.next();
		String[] a = s.split(",");
		if (a.length != 3) {
			System.out.println("���������Ϣ��ʽ����,����������,���硰Jackie,man,1234896579��");
		} else {

			Contacts contacts = new Contacts(a[0], a[1], a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());

		}

	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).toString());
		}
	}

	@Override
	public void findByName(ArrayList<Contacts> arrayList, String Name) {
		boolean isfindByName = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String na = contacts.getName();
			if (Name.equals(na)) {
				System.out.println(contacts.toString());
				isfindByName = true;
			}
		}
		if (!isfindByName) {
			System.out.println("��Ҫ���ҵĶ��󲻴���");
		}

	}

	@Override
	public void findBySex(ArrayList<Contacts> arrayList, String Sex) {
		boolean isfindBySex = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String se = contacts.getSex();
			if (Sex.equals(se)) {
				System.out.println(contacts.toString());
				isfindBySex = true;
			}

		}
		if (!isfindBySex) {
			System.out.println("��Ҫ���ҵĶ��󲻴���");
		}

	}

	@Override
	public void findByTelnum(ArrayList<Contacts> arrayList, String Telnum) {
		boolean isfindByTelnum = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts = arrayList.get(i);
			String num = contacts.getTelnum();
			if (Telnum.equals(num)) {
				System.out.println(contacts.toString());
				isfindByTelnum = true;
			}

		}
		if (!isfindByTelnum) {
			System.out.println("��Ҫ���ҵĺ��벻����");
		}

	}

}
