package guguoxin;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者:古国鑫&王焱
 * @date    创建时间：2017年12月6日 下午7:39:30 
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
