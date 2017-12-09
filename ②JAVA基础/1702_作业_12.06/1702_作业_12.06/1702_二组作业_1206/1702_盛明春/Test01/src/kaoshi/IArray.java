package kaoshi;

import java.util.ArrayList;
import java.util.Scanner;

public interface IArray {
void help();
void addStudent(ArrayList<Student> arrayList,Scanner sc );
void infoStudent(ArrayList<Student> arrayList);
double maxStudent(ArrayList<Student> arrayList,String subject);
}
