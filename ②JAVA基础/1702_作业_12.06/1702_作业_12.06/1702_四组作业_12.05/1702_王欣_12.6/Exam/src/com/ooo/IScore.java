package com.ooo;

import java.util.ArrayList;
/*�����ˣ�����
 *����2017��12��5��ʱ������4:51:45
 *����:2408368509@qq.com
 */
import java.util.Scanner;

public interface IScore {

	void AddStudent(ArrayList<Student> arrayList, Scanner sc);

	void infoStudent(ArrayList<Student> arrayList);

	double getMAX(ArrayList<Student> arrayList, Scanner sc);

}
