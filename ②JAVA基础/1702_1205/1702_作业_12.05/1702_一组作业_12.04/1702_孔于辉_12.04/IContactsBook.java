package com.contats;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContactsBook {

	// 返回值 方法名 (参数列表)

	void addContatacts(ArrayList<Contacts> arrayList, Scanner sc);

	void infoContatacts(ArrayList<Contacts> arrayList);

	void findByName(ArrayList<Contacts> arrayList, String name);
	void findBySex(ArrayList<Contacts> arrayList, String sex);
	void findByTeinum(ArrayList<Contacts> arrayList, String teinum);

}
