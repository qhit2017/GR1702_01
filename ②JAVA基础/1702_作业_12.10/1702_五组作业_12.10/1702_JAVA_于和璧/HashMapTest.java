package com.qhit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<User, String> hashMap = new HashMap<User, String>();
		
		
		
		
		User staff = new User("С��", "���˹�");
		User staff_1 = new User("С��", "����Ա");
		User staff_2 = new User("С��", "������");
		
		hashMap.put(staff, "3��");
		hashMap.put(staff_1, "4��");
		//�޸�
		hashMap.put(staff_1, "5��");
		hashMap.put(staff_2, "7��");
		
		Iterator<Entry<User, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
		Entry<User, String> entry = iterator.next();
		User key = entry.getKey();
		String value = entry.getValue();
		System.out.println(key.toString()+"����ʱ��Ϊ:"+value);
			
		}
	}
}
