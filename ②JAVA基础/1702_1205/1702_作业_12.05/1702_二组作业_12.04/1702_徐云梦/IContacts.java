package qhit.xym;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContacts {
	// ����
	void addContacts(ArrayList<Contacts> arrayList, Scanner sc);

	// ��ѯ����
	void infoContacts(ArrayList<Contacts> arrayList);

	// ͨ�������Ա�绰�����ѯ
	void findByNameSexTelnum(ArrayList<Contacts> arrayList, String sort);

}
