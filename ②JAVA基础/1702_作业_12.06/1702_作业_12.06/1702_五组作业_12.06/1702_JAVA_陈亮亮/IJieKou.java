package com.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**�����ߣ�������
 *����ʱ�䣺2017��12��7������8:14:15
 *���䣺2507147605@qq.com
 */
public interface IJieKou {
	
	void zhumoun();
	
	void add(ArrayList<ShuXing>arrayList,Scanner sc);
	
	void info(ArrayList<ShuXing>arrayList);
	
	void findchinese(ArrayList<ShuXing>arrayList);
	
	void findmath(ArrayList<ShuXing>arrayList);

	void findEnglish(ArrayList<ShuXing>arrayList);
	
	void findsum(ArrayList<ShuXing>arrayList);

}
