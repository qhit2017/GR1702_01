package fcj;

import java.util.ArrayList;
import java.util.Scanner;

public interface IExamine {
	void addExamine(ArrayList<Examine>arrayList,Scanner sc);
	void infoExamine(ArrayList<Examine>arrayList);
	void findByEMExamine(ArrayList<Examine>arrayList,String em);
	void findByCMExamine(ArrayList<Examine>arrayList,String cm);
	void findByMMExamine(ArrayList<Examine>arrayList,String mm);
	void findByTMExamine(ArrayList<Examine>arrayList,String tm);
}
