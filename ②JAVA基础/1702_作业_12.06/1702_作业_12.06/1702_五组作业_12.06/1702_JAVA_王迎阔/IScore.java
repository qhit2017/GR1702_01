package com.system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0  
 * @function
 */
public interface IScore {

	void help();
	
	//1 录入考生的高考信息
	void addExaminee(ArrayList<student>arrayList,Scanner sc);
	
	//2	显示所有考生信息
	void Information(ArrayList<student>arrayList);
	
	//3	查询最高分, 包括: 总分最高分 和 单科最高分
	double getMax(ArrayList<student>arrayList,String subject);

	
}
