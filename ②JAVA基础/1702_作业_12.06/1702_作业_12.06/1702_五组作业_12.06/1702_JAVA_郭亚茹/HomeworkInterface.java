package Com.Test;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ���� E-mail:1561061182@qq.com
 * @date    ����ʱ�䣺2017��11��8�� ����6:44:32 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public interface HomeworkInterface {
	void help();
	//¼�뿼��������Ϣ��
	void addPerformance(ArrayList<Performance>arrayList,Scanner sc);
	//��ʾ���п���������Ϣ
	void infoPerformance(ArrayList<Performance>arrayList);
	//��߷�
	void topscorePerformance(ArrayList<Performance>arrayList,String Grade);
	
}
