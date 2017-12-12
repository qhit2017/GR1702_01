package com.user;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author  ���� E-mail:295852280@qq.com
 * @date    ����ʱ�䣺2017��11��27�� ����4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class HashMapTest {
  	//�ṩ���϶���ĳ�ʼ������ӡ����ҡ��޸ġ�ɾ����������
	//����ʾ����HashMap�����Ԫ��ʹ��put(key , value)������
	//ȡֵͨ��get(key)�õ�Valueֵ������HashMap��Ҫ�ȵõ����������е�key����ͨ��key�õ���Ӧ��valueֵ ����
		
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
		
		
		System.out.println("�Ӽ����в���tom����Ϣ");
		ScoreUser u = user.get("tom");
		System.out.println(u.getId()+" "+u.getName()+" "+u.getSex());
		
		
		System.out.println("��ʾ����������Ա����Ϣ");
		Set<String> keys = user.keySet();
		
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()) {
			String name = (String)iterator.next();
			
			ScoreUser user2 = user.get(name);
			System.out.println(user2.getId()+" "+user2.getName()+" "+user2.getSex());
		}
	}
}
