package shiyan;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.print.attribute.standard.MediaSize.NA;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��12��10�� ����8:38:06 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class User {

	public static void main(String[] args) {
		HashMap<Yuangong, String> hashMap = new HashMap<Yuangong, String>();

		//����
		Yuangong yuangong = new Yuangong("tom", 55);
		hashMap.put(yuangong, "nam");
		//ɾ��
		//hashMap.remove(yuangong);
		//������
		Iterator<Entry<Yuangong, String>> iterator = hashMap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Yuangong, String> next = iterator.next();
			String value = next.getValue();
			Yuangong key = next.getKey();
			System.out.println(value.toString());
			System.out.println(key.toString());
		}
		//�޸�
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
