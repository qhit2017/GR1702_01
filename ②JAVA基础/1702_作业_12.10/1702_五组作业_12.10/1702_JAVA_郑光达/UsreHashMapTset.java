/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月10日 下午8:38:08 
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

		User staff = new User("马云", "男");

		User staff1 = new User("李嘉诚", "男");

		User staff2 = new User("马建林", "男");

		hashMap.put(staff, "身价1千");

		hashMap.put(staff1, "身价2千");

		hashMap.put(staff2, "身价3千");
		
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
