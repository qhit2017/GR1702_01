package com.xx;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContacts {
	
	//���
	void Add(ArrayList<Contacts> arr,Scanner as);
	//����
	void info(ArrayList<Contacts> arr);
	//����
	void findByName(ArrayList<Contacts> arr,String name);
	void findBySex(ArrayList<Contacts> arr,String sex);
	void findBy(ArrayList<Contacts> arr,String num);
	
	
	
}
