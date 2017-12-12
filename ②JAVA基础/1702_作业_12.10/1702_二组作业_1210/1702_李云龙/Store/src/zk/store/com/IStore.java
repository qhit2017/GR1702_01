package zk.store.com;

import java.util.ArrayList;
import java.util.Scanner;

public interface IStore {

	void addStore(ArrayList<Store> arrayList, Scanner sc);
	void stockStore(ArrayList<Store> arrayList,Scanner sc);
	void sellStore(ArrayList<Store> arrayList,Scanner sc);
	void infoStore(ArrayList<Store> arrayList);
}

