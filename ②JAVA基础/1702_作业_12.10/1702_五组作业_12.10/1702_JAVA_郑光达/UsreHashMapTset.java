/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��12��10�� ����8:38:08 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;



public class UsreHashMapTset {

	public static void main(String[] args) {

		HashMap<User, String> hashMap = new HashMap<User, String>();

		User staff = new User("����", "��");

		User staff1 = new User("��γ�", "��");

		User staff2 = new User("����", "��");

		hashMap.put(staff, "���1ǧ");

		hashMap.put(staff1, "���2ǧ");

		hashMap.put(staff2, "���3ǧ");
		
		Iterator<Entry<User, String>> iterator = hashMap.entrySet()
				.iterator();
		while (iterator.hasNext()) {
			Entry<User, String>entry = iterator.next();
			String value = entry.getValue();
			User key = entry.getKey();
			System.out.println(key.toString() + " " + value);
		}
				
	}

}
