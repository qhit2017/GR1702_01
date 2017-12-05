package yangxueting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年12月4日 下午5:26:29 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
	ArrayList<Contacts> arraylist=new ArrayList<Contacts>();
	ContactsService cService=new ContactsService();
	Scanner sc=new Scanner(System.in);
	cService.hlep();
	int key=0;
	
	boolean isQuit=true;
	while (isQuit) {
		key=sc.nextInt();
		switch (key) {
		case 1:
			cService.addContacts(arraylist, sc);
			break;
		case 2:
			cService.infoContacts(arraylist);
			break;
		case 3:
			String name=sc.next();
			cService.findByName(arraylist, name);
			break;
		case 4:
			String sex=sc.next();
			cService.findBySex(arraylist, sex);
			break;
		case 5:
			String num=sc.next();
			cService.findByNum(arraylist, num);
			break;
		case 6:
			isQuit=false;
			break;
		default:
			break;
		}
	}
	System.out.println("退出程序");
	}
}
