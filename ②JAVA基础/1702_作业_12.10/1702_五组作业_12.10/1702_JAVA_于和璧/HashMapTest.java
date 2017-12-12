package com.qhit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<User, String> hashMap = new HashMap<User, String>();
		
		
		
		
		User staff = new User("小王", "搬运工");
		User staff_1 = new User("小李", "技术员");
		User staff_2 = new User("小何", "财务经理");
		
		hashMap.put(staff, "3年");
		hashMap.put(staff_1, "4年");
		//修改
		hashMap.put(staff_1, "5年");
		hashMap.put(staff_2, "7年");
		
		Iterator<Entry<User, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
		Entry<User, String> entry = iterator.next();
		User key = entry.getKey();
		String value = entry.getValue();
		System.out.println(key.toString()+"工作时间为:"+value);
			
		}
	}
}
