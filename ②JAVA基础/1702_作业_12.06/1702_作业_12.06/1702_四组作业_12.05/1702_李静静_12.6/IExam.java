package kaoshi1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2004��1��1�� ����8:35:21
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public interface IExam {

	// ����
	void add(ArrayList<Exam> a, Scanner sc);

	// ����
	void info(ArrayList<Exam> a);

	// ��ѯ
	void find(ArrayList<Exam> a);

	// ��ѯ
	void find1(ArrayList<Exam> a);

	// ��ѯ
	void find2(ArrayList<Exam> a);

	// ��ѯ
	void find3(ArrayList<Exam> a);
}
