package qhit.xym;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContacts {
	// 增加
	void addContacts(ArrayList<Contacts> arrayList, Scanner sc);

	// 查询所有
	void infoContacts(ArrayList<Contacts> arrayList);

	// 通过姓名性别电话号码查询
	void findByNameSexTelnum(ArrayList<Contacts> arrayList, String sort);

}
