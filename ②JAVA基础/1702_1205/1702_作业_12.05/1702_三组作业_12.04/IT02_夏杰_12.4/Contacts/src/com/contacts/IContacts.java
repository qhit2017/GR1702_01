package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContacts {

	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	
	void infoContacts(ArrayList<Contacts> arrayList);
	
	void findByNameSexTelNum(ArrayList<Contacts> arrayList,String category,Scanner sc);
	
}
