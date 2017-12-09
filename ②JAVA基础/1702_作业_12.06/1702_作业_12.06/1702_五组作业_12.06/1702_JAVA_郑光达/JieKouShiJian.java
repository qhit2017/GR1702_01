/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��5�� ����6:56:42 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Test01;

import java.util.ArrayList;
import java.util.Scanner;

import com.homework.PrimeNumber;

public class JieKouShiJian implements IJiekou {

	@Override
	public void help() {
		System.out.println("---�ɼ�����ϵͳ����---");
		System.out.println("1      ¼��ɼ���Ϣ");
		System.out.println("2      ��ʾ�ɼ���Ϣ");
		System.out.println("3      ������߳ɼ���ѯ");
		System.out.println("4      �˳�����ϵͳ");

	}

	void help1() {
		System.out.println("---������߳ɼ���ѯ---");
		System.out.println("1      ��ӡ�ܷ���߷�");
		System.out.println("2      ��ӡ��ѧ��߷�");
		System.out.println("3      ��ӡ������߷�");
		System.out.println("4      ��ӡӢ����߷�");
		System.out.println("5      �������˵�");
	}

	@Override
	public void add(ArrayList<Performance> arrayList, Scanner sc) {
		String next = sc.next();
		String[] a = next.split(",");
		if (a.length != 5) {
			System.out.println("������ĸ�ʽ����ȷ��");
			System.out.println("��ʽΪ��");
			System.out.println("����,���,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�");
		} else {
			Performance performance = new Performance();

			performance.setName(a[0]);
			performance.setId(a[1]);
			performance.setLanguage(Double.parseDouble(a[2]));
			performance.setMath(Double.parseDouble(a[3]));
			performance.setEnglish(Double.parseDouble(a[4]));

			arrayList.add(performance);
			System.out.println(performance.toString());
		}

	}

	@Override
	public void info(ArrayList<Performance> arrayList) {

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}System.out.println("\n�������\n");

	}

	@Override
	public void languagemax(ArrayList<Performance> arrayList) {
		
		double max = 0;
		max = arrayList.get(0).getLanguage();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getLanguage()>max) {
				max = arrayList.get(i).getLanguage();
			}
		}System.out.println(max);

	}

	@Override
	public void Englishmax(ArrayList<Performance> arrayList) {
		double max = 0;
		max = arrayList.get(0).getEnglish();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getEnglish()>max) {
				max = arrayList.get(i).getEnglish();
			}
		}System.out.println(max);

	}

	@Override
	public void mathmax(ArrayList<Performance> arrayList) {
		double max = 0;
		max = arrayList.get(0).getMath();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getMath()>max) {
				max = arrayList.get(i).getMath();
			}
		}System.out.println(max);

	}

	@Override
	public void summax(ArrayList<Performance> arrayList) {
		double max = 0;
		max = arrayList.get(0).getsum();
		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getsum()>max) {
				max = arrayList.get(i).getsum();
			}
		}System.out.println(max);

	}

}
