package guguoxin;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ����:�Ź���&����
 * @date    ����ʱ�䣺2017��12��6�� ����7:39:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface IMarking {

	void addArrayList(ArrayList<MarkingSystem> arrayList,Scanner sc);
	
	void infoArrayList(ArrayList<MarkingSystem> arrayList);
	
	void findMaxArrayList(ArrayList<MarkingSystem> arrayList, String subject);
}
