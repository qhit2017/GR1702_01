package yangxueting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��12��4�� ����2:45:34 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IContactsBook {
	void hlep();
	
	void addContacts(ArrayList<Contacts> arrayList,Scanner sc);
	
	void infoContacts(ArrayList<Contacts> arrayList);
	
	void findByName(ArrayList<Contacts> arrayList,String name);
	
	void findBySex(ArrayList<Contacts> arrayList,String Sex);
	
	void findByNum(ArrayList<Contacts> arrayList,String Num);
	
	
}
