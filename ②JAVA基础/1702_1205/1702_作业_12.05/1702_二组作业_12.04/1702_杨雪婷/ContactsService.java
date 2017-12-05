package yangxueting;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��12��4�� ����3:20:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ContactsService implements IContactsBook{
	
	@Override
	public void hlep() {
		System.out.println("1¼��ͨѶ¼��Ϣ");
		System.out.println("2��ʾ����ͨѶ¼��Ϣ");
		System.out.println("3��������");
		System.out.println("4�Ա�����");
		System.out.println("5�绰����");
		System.out.println("6�˳�����");
	}
	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s=sc.next();
		String[] a=s.split(",");
		if (a.length!=3) {
			System.out.println("���������Ϣ��ʽ���ԣ�����д���룬�밴");
		} else {
			Contacts contacts=new Contacts(a[0],a[1],a[2]);
			arrayList.add(contacts);
			System.out.println(contacts.toString());
		}
		
	}

	@Override
	public void infoContacts(ArrayList<Contacts> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts=arrayList.get(i);
			System.out.println(contacts.toString());
		}
		
	}

	@Override
	public void findByName(ArrayList<Contacts> arrayList, String name) {
		
			boolean isFind = false;
			for (int i = 0; i < arrayList.size(); i++) {
				Contacts contacts=arrayList.get(i);
				String string = contacts.getName();
				if (name.equals(string)) {
					System.out.println(contacts.toString());
					isFind = true;
				}
				if (!isFind) {
					System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
				}
			}
		
	
	
	
}
	@Override
	public void findBySex(ArrayList<Contacts> arrayList, String Sex) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts=arrayList.get(i);
			String string = contacts.getSex();
			if (Sex.equals(string)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
			if (!isFind) {
				System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
			}
		}
	
		
	}
	@Override
	public void findByNum(ArrayList<Contacts> arrayList, String Num) {
		boolean isFind = false;
		for (int i = 0; i < arrayList.size(); i++) {
			Contacts contacts=arrayList.get(i);
			String string = contacts.getTelNum();
			if (Num.equals(string)) {
				System.out.println(contacts.toString());
				isFind = true;
			}
			if (!isFind) {
				System.out.println("��Ҫ���ҵĶ��󲻴��ڣ�");
			}
		}
	
		
	}


}
