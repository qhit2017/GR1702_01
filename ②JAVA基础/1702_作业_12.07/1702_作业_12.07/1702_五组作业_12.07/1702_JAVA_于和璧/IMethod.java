package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public interface IMethod {
	
	//������Ϣ
	void help();
	
	//������Ʒ
	void addcommodity(ArrayList<Commodity>arrayList,Scanner sc);
	
	//����
	void stockcommodity(ArrayList<Commodity>arrayList,Scanner sc);

	//����
	void removecommodity(ArrayList<Commodity>arrayList,Scanner sc);
	
	//�鿴���������Ʒ��Ϣ
	void infocommodity(ArrayList<Commodity>arrayList);

}
