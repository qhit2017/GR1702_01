package com.xx;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		HashMap<User, String> hashMap =  new HashMap<User, String>();
		User Tom = new User("Tom", 25);
		User Lifei = new User("Lifei", 20);
		User Xin = new User("Xin", 19);
		//put
		hashMap.put(Tom, "��");
		hashMap.put(Lifei, "��");
		hashMap.put(Xin, "Ů");
		//����   ������
		Iterator<Entry<User, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<User, String> entry = iterator.next();
			String value = entry.getValue();
			User key = entry.getKey();
			System.out.println(key.toString()+"�Ա�"+value+"]");
		}
	}
}
