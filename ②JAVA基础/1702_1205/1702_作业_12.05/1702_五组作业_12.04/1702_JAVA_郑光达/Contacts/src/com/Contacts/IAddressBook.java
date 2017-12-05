/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月4日 下午2:40:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Contacts;

import java.util.ArrayList;
import java.util.Scanner;

public interface IAddressBook {

	void Add(ArrayList<Contacts> arrayList, Scanner sc);

	void Info(ArrayList<Contacts> arrayList);

	void FindName(ArrayList<Contacts> arrayList, String category);

	void FindSex(ArrayList<Contacts> arrayList, String sex);

	void FindNumber(ArrayList<Contacts> arrayList, String phone);

}
