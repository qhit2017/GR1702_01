package com.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 作者 E-mail:1561061182@qq.com
 * @date 创建时间：2017年11月8日 下午6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public interface IContactsBook {
	// 录入通信录

	void addContacts(ArrayList<Contacts> arraylist, Scanner sc);

	void infoContacts(ArrayList<Contacts> arraylist);

	void findByname(ArrayList<Contacts> arraylist, String name);

	void findBysex(ArrayList<Contacts> arraylist, String sex);

	void findBytell(ArrayList<Contacts> arraylist, String tell);
}
