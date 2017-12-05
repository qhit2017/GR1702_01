package com.gugoxin;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年12月4日 下午2:42:18 
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
