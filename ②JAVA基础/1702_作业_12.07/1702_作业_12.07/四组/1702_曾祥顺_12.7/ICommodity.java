package kaoshi3;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��12��6�� ����6:30:25 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface ICommodity {

	//����
	void add(ArrayList<Commodity> arrayList,Scanner sc);
	
	//����
	void add1(ArrayList<Commodity> arrayList,Scanner sc);
	
	//����
	void remove(ArrayList<Commodity> arrayList,Scanner sc);
	
	//�鿴���
	void info(ArrayList<Commodity> arrayList);
	
}
