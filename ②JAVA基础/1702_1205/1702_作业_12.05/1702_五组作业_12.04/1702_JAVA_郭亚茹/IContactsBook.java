package com.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ���� E-mail:1561061182@qq.com
 * @date ����ʱ�䣺2017��11��8�� ����6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public interface IContactsBook {
	// ¼��ͨ��¼

	void addContacts(ArrayList<Contacts> arraylist, Scanner sc);

	void infoContacts(ArrayList<Contacts> arraylist);

	void findByname(ArrayList<Contacts> arraylist, String name);

	void findBysex(ArrayList<Contacts> arraylist, String sex);

	void findBytell(ArrayList<Contacts> arraylist, String tell);
}
