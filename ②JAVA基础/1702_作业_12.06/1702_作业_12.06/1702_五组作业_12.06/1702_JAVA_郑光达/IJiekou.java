/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��5�� ����6:53:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Test01;

import java.util.ArrayList;
import java.util.Scanner;

public interface IJiekou {

	void help();

	void add(ArrayList<Performance> arrayList, Scanner sc);

	void info(ArrayList<Performance> arrayList);

	void languagemax(ArrayList<Performance> arrayList);

	void Englishmax(ArrayList<Performance> arrayList);

	void mathmax(ArrayList<Performance> arrayList);

	void summax(ArrayList<Performance> arrayList);

}
