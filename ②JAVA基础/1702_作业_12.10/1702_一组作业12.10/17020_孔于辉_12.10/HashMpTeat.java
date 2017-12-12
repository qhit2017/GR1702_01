package com.kyh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMpTeat {
	public static void main(String[] args) {
		HashMap<User, String>  hashMap = new HashMap<User, String>();
		User arr = new User("001","tom", "男");
		hashMap.put(arr, "113231");
		
		System.out.println(hashMap.toString());
	
		System.out.println(hashMap.get(arr));
		
		Iterator<Entry<User, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<User, String> entry = iterator.next();
			User key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.toString()+" 联系方式："+value);
		}
		
		
		hashMap.remove(arr);
		System.out.println("删除之后");
		System.out.println(hashMap.toString());
		
		
	}

}
