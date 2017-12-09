package subject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
/*制作人：王欣
 *日期2017年12月7日时间上午8:46:17
 *邮箱:2408368509@qq.com
 */

public class Test {
public static void main(String[] args) {
	
	HashMap<User, String> hashMap=new HashMap<User, String>();
	
	User police=new User("police", 20);
	User docter=new User("docter", 21);
	User student=new User("student",18);
	
	hashMap.put(police, "marry");
	hashMap.put(docter, "LiHua");
	hashMap.put(student, "tom");
	
	String string = hashMap.get(police);
	String string2 = hashMap.get(docter);
	String string3 = hashMap.get(student);
	
	System.out.println(string+"   "+string2+"   "+string3);
	
	Iterator<Entry<User, String>> iterator = hashMap.entrySet().iterator();
	while (iterator.hasNext()) {
		Entry<User, String> entry = iterator.next();
		System.out.println(entry.toString());
		
	}
}
}
