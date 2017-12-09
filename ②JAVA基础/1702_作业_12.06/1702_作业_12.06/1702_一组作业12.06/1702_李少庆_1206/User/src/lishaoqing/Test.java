package lishaoqing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		
		HashMap<User, String> hashMap=new HashMap<User, String>();
		
		User programmer=new User("programmer");
		User police=new User("police");
		User farmer=new User("farmer");
		
		hashMap.put(programmer, "tom");
		hashMap.put(police, "Lihua");
		hashMap.put(farmer, "XiaoMing");
		
		String string = hashMap.get(programmer);
		String string2 = hashMap.get(police);
		String string3 = hashMap.get(farmer);
		
		System.out.println(string+"  "+string2+"  "+string3);
		
		Iterator<Entry<User, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<User, String> entry = iterator.next();
			System.out.println(entry.toString());
			
		}
	}

}
