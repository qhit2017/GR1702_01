import java.util.ArrayList;
import java.util.Scanner;

public interface Isorce {
	// ¼�뿼����Ϣ
	void addStudent(ArrayList<Student> arrayList, Scanner sc);

	// ��ʾ���п�����Ϣ
	void infoStudent(ArrayList<Student> arrayList);

	// �������ֵ
	double getMax(ArrayList<Student> arrayList, String subject);
}
