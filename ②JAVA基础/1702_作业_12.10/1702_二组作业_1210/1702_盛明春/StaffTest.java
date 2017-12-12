package test;
//

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class StaffTest {
	public static void main(String[] args) {
		HashMap<Staff, String> hashMap = new HashMap<Staff, String>();
		Staff name = new Staff("001", "Tom");
		hashMap.put(name, "13838497658");
		//hashMap.put(name, "ÄÐ");
		//hashMap.remove(name);
		String string = hashMap.get(name);
		System.out.println(string);
		Iterator<Entry<Staff, String>> iterable = hashMap.entrySet().iterator();
		while (iterable.hasNext()) {
			Entry<Staff, String> entry = iterable.next();
			Staff key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.toString() + " " + value);

		}
	}
}
