package com.User;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 作者 E-mail:1561061182@qq.com
 * @date 创建时间：2017年11月8日 下午6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class UserHashMap {

	public static void main(String[] args) {
		// 使用HashMap对象保存员工对象，查找姓名为”tom”的员工信息，并遍历所有员工信息
		// 提供集合对象的初始化、添加、查找、修改、删除、遍历；
		// （提示：向HashMap中添加元素使用put(key ,
		// value)方法；取值通过get(key)得到Value值。遍历HashMap需要先得到集合中所有的key，再通过key得到对应的value值
		// 。）
		HashMap<String, User> user = new HashMap<String, User>();
		User a = new User();
		a.setName("name");
		a.setId("id");
		a.setSex("Sex");
		
	 	user.put(a.getName(), a);
	 	
		User a1 = new User();
		a1.setName("Tom");
		a1.setId("1");
		
		user.put(a1.getName(), a1);
		
		System.out.println("从集合中找到Tom的信息");
		
		User user2 = user.get("Tom");
		System.out.println(user2.getName() + "" + user2.getId());
		
		System.out.println("显示所有信息");
		
		Set<String> keySet = user.keySet();
		Iterator<String> iterator = keySet.iterator();
		
		while (iterator.hasNext()) {
			String string = iterator.next();
			User user3 = user.get(string);
			System.out.println(user3 .getName()+""+user3.getId()+""+user3.getSex());

		}

	}

}
