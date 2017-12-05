package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContatc {
	
	
	
	
	
	void findByName(ArrayList<Contatc> arrayList,String name);
	void findBySex(ArrayList<Contatc> arrayList,String sex);
	void findByNum(ArrayList<Contatc> arrayList,String num);

	void infoContatc(ArrayList<Contatc> arrayList);



	void addContatc(ArrayList<Contatc> arrayList, Scanner sc);

}
