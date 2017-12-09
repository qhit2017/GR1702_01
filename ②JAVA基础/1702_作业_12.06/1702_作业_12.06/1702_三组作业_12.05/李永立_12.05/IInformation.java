package com.lyl.qhit;

import java.util.ArrayList;
import java.util.Scanner;

public interface IInformation {
	
	/*模拟一个高考评分系统，其业务范围包括：
	1	录入考生的高考信息
	2	显示所有考生信息
	3	查询最高分, 包括: 总分最高分 和 单科最高分
	4	退出功能*/
	
	
	void helpinfo();
	
    void addInformation(ArrayList<Student>  arrayList   ,Scanner sc);
    
    void infoInformation(ArrayList<Student>  arrayList  );
    
    void findInformation(ArrayList<Student>  arrayList  );
    
    double getMax(ArrayList<Student>  arrayList, String subject);
}
