package com.qhit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		HashMap<User, String> hashMap = new HashMap<User, String>();
		User xiaoming = new User("xiaoming", 17);
		User xiaohong = new User("xiaohong", 20);
		User xiaoqiang = new User("xiaoqiang", 18);
		// put
		hashMap.put(xiaoming, "男");
		hashMap.put(xiaohong, "女");
		hashMap.put(xiaoqiang, "男");
		// 遍历 迭代器
		Iterator<Entry<User, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<User, String> entry = iterator.next();
			String value = entry.getValue();
			User key = entry.getKey();
			System.out.println(key.toString() + "性别：" + value + "]");
		}
	}
}
