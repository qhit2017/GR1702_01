package com.ccc;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContacts {

	void addContacts(ArrayList<Contacts> arrayList, Scanner sc);

	void infoContacts(ArrayList<Contacts> arrayList);

	void findBynameNumber(ArrayList<Contacts> arrayList, Scanner sc,
			String category);

}
