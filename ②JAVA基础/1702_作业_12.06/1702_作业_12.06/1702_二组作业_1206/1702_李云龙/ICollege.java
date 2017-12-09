package zk.college.com;

import java.util.ArrayList;
import java.util.Scanner;

public interface ICollege {

	void addCollege(ArrayList<College> arrayList,Scanner sc);
	
	void infoCollege(ArrayList<College> arrayList);
	
	void getMax(ArrayList<College> arrayList,String s );
	
	
}
