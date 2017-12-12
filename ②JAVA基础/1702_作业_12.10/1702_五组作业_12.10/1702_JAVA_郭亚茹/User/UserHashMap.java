package com.User;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ���� E-mail:1561061182@qq.com
 * @date ����ʱ�䣺2017��11��8�� ����6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class UserHashMap {

	public static void main(String[] args) {
		// ʹ��HashMap���󱣴�Ա�����󣬲�������Ϊ��tom����Ա����Ϣ������������Ա����Ϣ
		// �ṩ���϶���ĳ�ʼ������ӡ����ҡ��޸ġ�ɾ����������
		// ����ʾ����HashMap�����Ԫ��ʹ��put(key ,
		// value)������ȡֵͨ��get(key)�õ�Valueֵ������HashMap��Ҫ�ȵõ����������е�key����ͨ��key�õ���Ӧ��valueֵ
		// ����
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
		
		System.out.println("�Ӽ������ҵ�Tom����Ϣ");
		
		User user2 = user.get("Tom");
		System.out.println(user2.getName() + "" + user2.getId());
		
		System.out.println("��ʾ������Ϣ");
		
		Set<String> keySet = user.keySet();
		Iterator<String> iterator = keySet.iterator();
		
		while (iterator.hasNext()) {
			String string = iterator.next();
			User user3 = user.get(string);
			System.out.println(user3 .getName()+""+user3.getId()+""+user3.getSex());

		}

	}

}
