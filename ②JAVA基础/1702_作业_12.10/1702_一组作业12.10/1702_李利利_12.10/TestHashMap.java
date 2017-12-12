import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.jws.soap.SOAPBinding.Use;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<User, String> hashMap = new HashMap<User, String>();

		User tom = new User("tom", "001");
		hashMap.put(tom, "Ů");
		hashMap.put(tom, "12378945636");
		hashMap.remove(tom);
		String string = hashMap.get(tom);
		System.out.println(string);

		Iterator<Entry<User, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<User, String> entry = iterator.next();
			User key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.toString() + " " + value);
		}
	}

}
