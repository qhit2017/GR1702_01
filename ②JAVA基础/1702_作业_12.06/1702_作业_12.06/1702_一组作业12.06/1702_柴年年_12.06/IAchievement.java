package com.achievement;

import java.util.ArrayList;
import java.util.Scanner;

public interface IAchievement {

	void addAchievement(ArrayList<Achievement> arrayList, Scanner sc);
	
	void infoAchievement(ArrayList<Achievement> arrayList);
	
	void findAchievement(ArrayList<Achievement> arrayList, String pion);
}
