package com.gugoxin;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��12��4�� ����2:42:18 
 * @version 1.0
 * @function
 */
public interface IContacts {

	void addContacts(ArrayList<Contacts>arrayList,Scanner sc);
	
	void infoContacts(ArrayList<Contacts>arrayList);
	
	void findByname(ArrayList<Contacts>arrayList,String name);
	void findBysex(ArrayList<Contacts>arrayList,String sex);
	void findBynum(ArrayList<Contacts>arrayList,String num);

}
