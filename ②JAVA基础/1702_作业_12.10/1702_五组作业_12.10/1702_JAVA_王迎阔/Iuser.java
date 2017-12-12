package com.user;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  作者 E-mail:295852280@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
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
