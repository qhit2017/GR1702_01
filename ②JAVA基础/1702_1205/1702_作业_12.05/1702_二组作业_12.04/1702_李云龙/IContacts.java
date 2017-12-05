package com.Contacts;

import java.util.ArrayList;
import java.util.Scanner;



public interface IContacts {

	void addcontacts(ArrayList<Contacts> arryArrayList, Scanner sc);
	
	void infocontacts(ArrayList<Contacts> arryArrayList, Scanner sc);
	
	void findByName(ArrayList<Contacts> arryArrayList, String name);
	void findBySex(ArrayList<Contacts> arryArrayList, String sex);
	void findByNum(ArrayList<Contacts> arryArrayList, String num);
	
}
