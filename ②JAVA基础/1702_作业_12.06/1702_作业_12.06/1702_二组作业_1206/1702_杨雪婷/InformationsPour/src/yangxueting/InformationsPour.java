package yangxueting;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��12��5�� ����5:34:07 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface InformationsPour {

	void help();
	void add(ArrayList<formationsPour>arrayList,Scanner sc);
	void info(ArrayList<formationsPour>arrayList);
	void findmax(ArrayList<formationsPour>arrayList,Scanner sc);
	void findchina(ArrayList<formationsPour>arrayList,Scanner sc);
	void findmath(ArrayList<formationsPour>arrayList,Scanner sc);
	void findenglish(ArrayList<formationsPour>arrayList,Scanner sc);
}
