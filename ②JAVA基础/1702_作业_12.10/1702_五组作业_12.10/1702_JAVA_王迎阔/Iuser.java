package com.user;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  ���� E-mail:295852280@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface Iuser {

	void  addEmployee(ArrayList<ScoreUser>arrayList,Scanner sc);
	
	void  findEmployee(ArrayList<ScoreUser>arrayList,String name);
	
	void  modificationEmployee(ArrayList<ScoreUser>arrayList,String name);
	
	void  removeEmployee(ArrayList<ScoreUser>arrayList,Scanner sc);
	
	void  infoEmployee(ArrayList<ScoreUser>arrayList,String name);
}
