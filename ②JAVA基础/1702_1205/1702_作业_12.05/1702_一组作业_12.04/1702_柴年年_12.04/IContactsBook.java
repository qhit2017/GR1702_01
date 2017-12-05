package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContactsBook {
	//ÃÌº”
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	//œ‘ æ
	void infoContacts(ArrayList<Contacts> arrayList);
	//≤È’“
	void findByName(ArrayList<Contacts> arrayList,String category);
	void findBySex(ArrayList<Contacts> arrayList,String category);
	void findBylsum(ArrayList<Contacts> arrayList,String category);
}
