import java.util.ArrayList;
import java.util.Scanner;


public interface IGrade {
	
	void addGrade(ArrayList<GradeSystem> arrayList,Scanner sc);
	
	void infoGrade(ArrayList<GradeSystem> arrayList);
	
	void findsungrade(ArrayList<GradeSystem> arrayList);
	
	void findchinesegrade(ArrayList<GradeSystem> arrayList);
	
	void findmathgrade(ArrayList<GradeSystem> arrayList);
	
	void findenglishgrade(ArrayList<GradeSystem> arrayList);
	

}
