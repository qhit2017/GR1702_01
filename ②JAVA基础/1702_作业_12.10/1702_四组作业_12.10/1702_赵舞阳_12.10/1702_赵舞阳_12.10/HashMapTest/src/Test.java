import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		// ӳ��key��-----valueֵ
		HashMap<Country, String> hashMap = new HashMap<Country, String>();
		Country china = new Country("china", 15);
		Country india = new Country("india", 13);
		Country japan = new Country("japan", 2);
		// ͨ��put������Map����Ŷ���
		hashMap.put(china, "Beijing");
		hashMap.put(india, "Delhi");
		hashMap.put(japan, "Tokyo");
		// ͨ��key�ҵ�valueֵ
		String string = hashMap.get(china);
		System.out.println(string);
		String string1 = hashMap.get(india);
		System.out.println(string1);
		String string2 = hashMap.get(japan);
		System.out.println(string2);
		// ����������
		Iterator<Entry<Country, String>> iterator = hashMap.entrySet()
				.iterator();
		while (iterator.hasNext()) {
			Entry<Country, String> entry = iterator.next();
			Country key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.toString() + "\t\t" + value);
		}
	}
}
