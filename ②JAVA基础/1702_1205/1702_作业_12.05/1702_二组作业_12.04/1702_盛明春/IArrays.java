package zk.qhit.smc;

import java.util.ArrayList;
import java.util.Scanner;

public interface IArrays {

	void help();

	// ���
	void addAddressBook(ArrayList<AddressBook> arrayList, Scanner sc);

	// ����
	void infoAddressBook(ArrayList<AddressBook> arrayList);

	// ��ѯ
	void findByNameSexNum(ArrayList<AddressBook> arrayList, String sort,
			Scanner sc);
}
