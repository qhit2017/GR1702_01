//�ӿ�
package com.chen;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContacts {

	//¼��ͨѶ¼��Ϣ
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	
	//��ѯ����
	void infoContacts(ArrayList<Contacts>arrayList);
	
	//����������ѯ���Ա��ѯ���绰��ѯ
	void findByName(ArrayList<Contacts>arrayList,String name);
	void findBySex(ArrayList<Contacts>arrayList,String Sex);
	void findByNum(ArrayList<Contacts>arrayList,String num);
	
}
