package kaoshi1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 作者 曾祥顺\张彤彤
 * @date 创建时间：2004年1月1日 上午8:35:21
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public interface IExam {

	// 增加
	void add(ArrayList<Exam> a, Scanner sc);

	// 遍历
	void info(ArrayList<Exam> a);

	// 查询
	void find(ArrayList<Exam> a);

	// 查询
	void find1(ArrayList<Exam> a);

	// 查询
	void find2(ArrayList<Exam> a);

	// 查询
	void find3(ArrayList<Exam> a);
}
