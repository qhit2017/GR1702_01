package com.Contacts;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IContactsBook {

	//¼��ͨѶ¼��Ϣ
	//����ֵ  ������(�����б�)
	// ���� ����ض����ܵĴ����
	void addContacts(ArrayList<Contacts>arrayList,Scanner sc);
	
	
	void infoContacts(ArrayList<Contacts>arrayList);
	
	
	public void findByName(ArrayList<Contacts> arrayList, String name);
	
	
	public void findBySex(ArrayList<Contacts> arrayList, String name);
	
	
	public void findBytelNum(ArrayList<Contacts> arrayList, String name);
}
