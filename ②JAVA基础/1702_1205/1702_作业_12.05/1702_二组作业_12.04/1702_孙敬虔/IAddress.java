package com.zk;

import java.util.ArrayList;
import java.util.Scanner;

public interface IAddress {

	void addAddress(ArrayList<Address> arrayList, Scanner sc);

	void infoAddress(ArrayList<Address> arrayList);

	void findname(ArrayList<Address> arrayList, String name);

	void findsex(ArrayList<Address> arrayList, String sex);

	void findNum(ArrayList<Address> arrayList, String Num);

}
