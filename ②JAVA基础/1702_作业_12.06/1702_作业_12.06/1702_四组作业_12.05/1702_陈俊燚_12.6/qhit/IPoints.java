//接口
package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;
//1、录入考试信息信息包含姓名、编号、语文、数学、英语成绩，并计算出总成绩
public interface IPoints {
	//录入考生信息
   void addPoints(ArrayList<Points>arrayList,Scanner sc);
   //查询所有
   void infoPoints(ArrayList<Points>arrayList);
   //姓名查询
   void findByName(ArrayList<Points>arrayList,String name);
   //编号查询
   void findByNum(ArrayList<Points>arrayList,String num);
   //语文，数学，英语查询
   void findBylangmathEng(ArrayList<Points>arrayList,String ceteegory);
   //计算总成绩
   void findBytotal(ArrayList<Points>arrayList,String total);
}
