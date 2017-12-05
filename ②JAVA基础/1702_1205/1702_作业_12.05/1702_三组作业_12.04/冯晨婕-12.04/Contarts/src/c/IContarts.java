package c;

import java.util.ArrayList;
import java.util.Scanner;

public interface IContarts {
	void addContarts(ArrayList<Contarts> arrayList, Scanner sc);
	void infoContarts(ArrayList<Contarts> arrayList);
	//void findByNameSexNum(ArrayList<Contarts> arrayList,String category  );
	void findByName(ArrayList<Contarts> arrayList,String name  );
	void findBySex(ArrayList<Contarts> arrayList,String  sex );
	void findByNum(ArrayList<Contarts> arrayList,String num  );
	
}
