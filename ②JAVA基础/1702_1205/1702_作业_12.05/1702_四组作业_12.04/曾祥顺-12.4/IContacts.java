package zengxiangshun;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2004��1��5�� ����2:41:39
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public interface IContacts {

	// ����
	void add(ArrayList<Contacts> arrayList, Scanner sc);

	// ����
	void info(ArrayList<Contacts> arrayList);

	// ����
	void find(ArrayList<Contacts> arrayList, String leixing,Scanner sc);
}
