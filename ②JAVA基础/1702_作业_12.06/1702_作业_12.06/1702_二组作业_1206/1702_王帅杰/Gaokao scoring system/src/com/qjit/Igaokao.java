package com.qjit;

import java.util.ArrayList;
import java.util.Scanner;

public interface Igaokao {

	void addGaokao(ArrayList<Gaokao> arrayList, Scanner sc);

	void infoGaokao(ArrayList<Gaokao> arrayList);

	void getMax(ArrayList<Gaokao> arrayList, String subjiect);
}
