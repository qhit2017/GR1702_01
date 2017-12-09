package Com.Test;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  作者 E-mail:1561061182@qq.com
 * @date    创建时间：2017年11月8日 下午6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface HomeworkInterface {
	void help();
	//录入考生考试信息。
	void addPerformance(ArrayList<Performance>arrayList,Scanner sc);
	//显示所有考生考试信息
	void infoPerformance(ArrayList<Performance>arrayList);
	//最高分
	void topscorePerformance(ArrayList<Performance>arrayList,String Grade);
	
}
