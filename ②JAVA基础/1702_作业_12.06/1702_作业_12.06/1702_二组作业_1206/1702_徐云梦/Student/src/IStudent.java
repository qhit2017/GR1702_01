import java.util.ArrayList;
import java.util.Scanner;


public interface IStudent {
	void addStudent(ArrayList<Student>arrayList,Scanner sc);
	void infoStudent(ArrayList<Student>arrayList);
	double findMaxStudent(ArrayList<Student>arrayList,String subject);
}
