package com.ooo;

import java.util.ArrayList;
/*制作人：王欣
 *日期2017年12月5日时间下午4:51:45
 *邮箱:2408368509@qq.com
 */
import java.util.Scanner;

public interface IScore {

	void AddStudent(ArrayList<Student> arrayList, Scanner sc);

	void infoStudent(ArrayList<Student> arrayList);

	double getMAX(ArrayList<Student> arrayList, Scanner sc);

}
