package yangxueting;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年12月5日 下午5:34:07 
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
