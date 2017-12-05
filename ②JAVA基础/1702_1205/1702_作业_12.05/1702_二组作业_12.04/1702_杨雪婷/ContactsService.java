package yangxueting;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年12月4日 下午3:20:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ContactsService implements IContactsBook{
	
	@Override
	public void hlep() {
		System.out.println("1录入通讯录信息");
		System.out.println("2显示所有通讯录信息");
		System.out.println("3姓名搜索");
		System.out.println("4性别搜索");
		System.out.println("5电话搜索");
		System.out.println("6退出功能");
	}
	@Override
	public void addContacts(ArrayList<Contacts> arrayList, Scanner sc) {
		String s=sc.next();
		String[] a=s.split(",");
		if (a.length!=3) {
			System.out.println("你输入的信息格式不对，请重写输入，请按");
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
					System.out.println("您要查找的对象不存在！");
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
				System.out.println("您要查找的对象不存在！");
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
				System.out.println("您要查找的对象不存在！");
			}
		}
	
		
	}


}
