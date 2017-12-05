package com.qk;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContacts {

	void add(ArrayList<Contacts> arrayList, Scanner sc);

	void info(ArrayList<Contacts> arrayList);

	void findName(ArrayList<Contacts> arrayList, String Name);

	void findsex(ArrayList<Contacts> arrayList, String sex);

	void findNumber(ArrayList<Contacts> arrayList, String Number);

}
