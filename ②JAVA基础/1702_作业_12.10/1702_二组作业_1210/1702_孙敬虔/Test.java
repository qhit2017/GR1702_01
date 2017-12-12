package com.hashnap.zk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		HashMap<User, String> hashMap =  new HashMap<User, String>();
		User Tom = new User("Tom", 18);
		
		User Liulei = new User("Liulei", 17);
		
		User Lily = new User("Lily", 16);
		
		hashMap.put(Tom, "ÄÐ");
		
		hashMap.put(Liulei, "ÄÐ");
		
		hashMap.put(Lily, "Å®");
		
		Iterator<Entry<User, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<User, String> entry = iterator.next();
			String value = entry.getValue();
			User key = entry.getKey();
			System.out.println(key.toString()+"ÐÔ±ð£º"+value+"]");
		}

	}

}
