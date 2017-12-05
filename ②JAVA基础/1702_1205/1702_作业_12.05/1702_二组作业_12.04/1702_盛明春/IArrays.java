package zk.qhit.smc;

import java.util.ArrayList;
import java.util.Scanner;

public interface IArrays {

	void help();

	// Ìí¼Ó
	void addAddressBook(ArrayList<AddressBook> arrayList, Scanner sc);

	// ±éÀú
	void infoAddressBook(ArrayList<AddressBook> arrayList);

	// ²éÑ¯
	void findByNameSexNum(ArrayList<AddressBook> arrayList, String sort,
			Scanner sc);
}
