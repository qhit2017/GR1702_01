package com.wyk;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IEmployeeSystem {

   //������Ʒ
   void addEmployee(ArrayList<Employee>arrayList,Scanner sc);
   //����
   void getEmployee(ArrayList<Employee>arrayList,Scanner sc);
   //����
   void sellEmployee(ArrayList<Employee>arrayList,Scanner sc);
   //�ο����
   void infoEmployee(ArrayList<Employee>arrayList,Scanner sc);
  
   
}
