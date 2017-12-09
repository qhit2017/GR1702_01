import java.util.ArrayList;
import java.util.Scanner;

public interface Isorce {
	// 录入考试信息
	void addStudent(ArrayList<Student> arrayList, Scanner sc);

	// 显示所有考生信息
	void infoStudent(ArrayList<Student> arrayList);

	// 返回最大值
	double getMax(ArrayList<Student> arrayList, String subject);
}
