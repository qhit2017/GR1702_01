package GaokaoScoringSystem;

import java.util.ArrayList;
import java.util.Scanner;

public interface IStudent {
	void findByName(ArrayList<Student> arrayList, String name);

	void findById(ArrayList<Student> arrayList, String id);

	void findByYvwenchengji(ArrayList<Student> arrayList, double yvwenchengji);

	void findByShuxuechengji(ArrayList<Student> arrayList, double shuxuechengji);

	void findByEnglishchengji(ArrayList<Student> arrayList,
			double englishchengji);

	void findByZongchengji(ArrayList<Student> arrayList, double zongchengji);

	void infoStudent(ArrayList<Student> arrayList);

	void addStudent(ArrayList<Student> arrayList, Scanner sc);
}
