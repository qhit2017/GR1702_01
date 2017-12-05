package com.contacts;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月4日 下午2:40:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IContacts {

	void addcon(ArrayList<Contacts> arraylist,Scanner sc);
	void info(ArrayList<Contacts> arraaylist);
	void findby(ArrayList<Contacts> arraylist,Scanner sc);
}
