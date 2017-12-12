package shiyan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.print.attribute.standard.MediaSize.NA;

/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年12月10日 下午8:38:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class User {

	public static void main(String[] args) {
		HashMap<Yuangong, String> hashMap = new HashMap<Yuangong, String>();

		//增加
		Yuangong yuangong = new Yuangong("tom", 55);
		hashMap.put(yuangong, "nam");
		//删除
		//hashMap.remove(yuangong);
		//迭代器
		Iterator<Entry<Yuangong, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Yuangong, String> next = iterator.next();
			String value = next.getValue();
			Yuangong key = next.getKey();
			System.out.println(value.toString());
			System.out.println(key.toString());
		}
		//修改
		Iterator<Entry<Yuangong, String>> iterator1 = hashMap.entrySet().iterator();
		while (iterator1.hasNext()) {
			Entry<Yuangong, String> next = iterator1.next();
			String value =next.setValue("jia");
			String value2 = next.getValue();
			Yuangong key = next.getKey();
			System.out.println(value2.toString());
			System.out.println(key.toString());
		}
		
	}

}
