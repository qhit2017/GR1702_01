/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月5日 下午6:53:34 
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
