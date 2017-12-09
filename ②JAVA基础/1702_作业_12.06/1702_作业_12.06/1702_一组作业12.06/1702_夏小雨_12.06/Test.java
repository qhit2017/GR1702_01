package com.xxy;

import java.util.ArrayList;
import java.util.Scanner;



public class Test {
public static void main(String[] args) {
	ArrayList<MarkingSystem> arrayList = new ArrayList<MarkingSystem>();
	Systems cService = new Systems();
	Scanner sc = new Scanner(System.in);
	cService.infohelp();
	int key = 0 ;
	boolean isquit = true;
	
	while (isquit) {
		key = sc.nextInt();
		switch (key) {
		case 1:
			cService.addMarkingSystem(arrayList, sc);
			break;
		case 2:
			cService.infoMarkingSystem(arrayList);
			break;
}
}
}
}