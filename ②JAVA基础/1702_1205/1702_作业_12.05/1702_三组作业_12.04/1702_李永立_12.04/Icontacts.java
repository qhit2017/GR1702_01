package com.lyl;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:������271406@163.com
 * @date    ����ʱ�䣺2017��12��4�� ����2:43:44 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */

public interface Icontacts {
	
	void addContacts(ArrayList<Contacts> arrayList , Scanner sc );
	
	
	void infoContacts(ArrayList<Contacts> arrayList);
	
	
	void findname(ArrayList<Contacts> arrayList , String name);
	void findsex(ArrayList<Contacts> arrayList ,String sex); 
	void findnum(ArrayList<Contacts> arrayList , String num);
}
