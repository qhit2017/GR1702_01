import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		HashMap<User, String> hashMap = new HashMap<User, String>();
		User name = new User("tom", "001", "ÄÐ");

		hashMap.put(name, "001");
		//hashMap.remove(name);
		String string = hashMap.get(name);
		System.out.println(string);

		Iterator<Entry<User, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<User, String> entry = iterator.next();
			User key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.toString() + "" + value);

		}
	}

}
