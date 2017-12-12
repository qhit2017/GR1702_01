package com.qinghua;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Country, String>hashMap=new HashMap<Country, String>();
		
		Country china=new Country("china", 15);
		Country japan=new Country("japan", 2);
		Country england=new Country("england", 1);
		
		hashMap.put(china, "BeiJing");
		hashMap.put(japan, "Tokyo");
		hashMap.put(england, "London");
		
		String string = hashMap.get(china);
		
		 
		String string2 = hashMap.get(japan);
		System.out.println(string2);
		
		String string3 = hashMap.get(england);
		System.out.println(string3);
		
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			String value = entry.getValue();
			Country key = entry.getKey();
			System.out.println(key.toString()+""+value);
			
			
		}
	}

}
