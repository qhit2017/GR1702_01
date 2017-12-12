package com.user;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author  作者 E-mail:295852280@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class HashMapTest {
  	//提供集合对象的初始化、添加、查找、修改、删除、遍历；
	//（提示：向HashMap中添加元素使用put(key , value)方法；
	//取值通过get(key)得到Value值。遍历HashMap需要先得到集合中所有的key，再通过key得到对应的value值 。）
		
	public static void main(String[] args) {
		
		HashMap<String,ScoreUser> user = new HashMap<String,ScoreUser>();
		ScoreUser u1 = new ScoreUser();
		u1.setId("id");
		u1.setName("name");
		u1.setSex("sex");
		
		
		user.put(u1.getName(),u1);
		
		ScoreUser u2= new ScoreUser();
		u2.setId("1");
		u2.setName("tom");
		u2.setSex("man");
		
		
		user.put(u2.getName(),u2);
		
		
		System.out.println("从集合中查找tom的信息");
		ScoreUser u = user.get("tom");
		System.out.println(u.getId()+" "+u.getName()+" "+u.getSex());
		
		
		System.out.println("显示集合中所有员工信息");
		Set<String> keys = user.keySet();
		
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()) {
			String name = (String)iterator.next();
			
			ScoreUser user2 = user.get(name);
			System.out.println(user2.getId()+" "+user2.getName()+" "+user2.getSex());
		}
	}
}
