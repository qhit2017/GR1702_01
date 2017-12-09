package com.wyk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import oracle.jrockit.jfr.tools.ConCatRepository;

/**
 * @author  ���� E-mail:1456014420@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class RealizeEmployee implements IEmployeeSystem{

	void help(){
		System.out.println("-----��Ʒ������ϵͳ-----");
		System.out.println("[1]������Ʒ������add");
		System.out.println("[2]��Ʒ����������get");
		System.out.println("[3]��Ʒ����������sell");
		System.out.println("[4]�鿴��Ʒ���������info");
		System.out.println("[5]�˳�ϵͳ����Exit");
	}
	
	
	@Override
	public void addEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		String string =sc.next();
		String[]a=string.split(",");
		
		if (a.length!=4) {
			System.out.println("�����������룬����ĸ�ʽ����:");
			System.out.println("001��ƻ����1Ԫ��20");
		} else {
			Employee employee = new Employee(a[0],a[1],Double.parseDouble(a[2]),Double.parseDouble(a[3]));
			 arrayList.add(employee);
			 System.out.println(arrayList.toString());
			 System.out.println("��ӳɹ�");
		}
		
	}

	@Override
	public void getEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("��������Ʒ���");
		String s = sc.next();
		
		boolean isEmployeeid = false;
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			String id = arrayList.get(i).getId();
			
			if (id.equals(s)) {
				
				System.out.println("�������������");
				
				int j = sc.nextInt();
				
				arrayList.get(i).setQuantity(arrayList.get(i).getQuantity() + j);
				
				System.out.println("����������Ϊ" + arrayList.get(i).getQuantity());
				
				
				isEmployeeid = true;
			}
			if (!isEmployeeid) {
				System.out.println("����ʧ��");
			}
		}

	}

	@Override
	public void sellEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		System.out.println("��������Ʒ���");
		String string = sc.next();
		boolean isQuit = false;
		for (int i = 0; i <arrayList.size(); i++) {
			String d = arrayList.get(i).getId();
			if(string.equals(d)){
				System.out.println("��������������");
				int y = sc.nextInt();
				double l = arrayList.get(i).getPrice();
				if(y>=1){
					arrayList.get(i).setPrice(l-y);
					System.out.println("���ۺ������:"+arrayList.get(i).getQuantity());
					isQuit = true;
				}
				if(!isQuit){
					System.out.println("����ʧ�ܣ�");
				}
			}
		}
		
	}

	@Override
	public void infoEmployee(ArrayList<Employee> arrayList, Scanner sc) {
		for (Employee employee : arrayList) {
			System.out.println(employee.toString());
		}
		
	}

}
