package com.wxxx;

import java.util.ArrayList;
/*�����ˣ�����
 *����2017��12��6��ʱ������6:45:14
 *����:2408368509@qq.com
 */
import java.util.Scanner;

public interface IContacts {
	
	void addContacts(ArrayList<Contacts>arrayList,Scanner sc);
	
	void infoContacts(ArrayList<Contacts>arrayList);
	
	void stock(ArrayList<Contacts> arrayList, Scanner sc);

	void market(ArrayList<Contacts> arrayList, Scanner sc);
}
