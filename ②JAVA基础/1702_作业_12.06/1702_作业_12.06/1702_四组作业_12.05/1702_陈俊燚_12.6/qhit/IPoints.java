//�ӿ�
package com.qhit;

import java.util.ArrayList;
import java.util.Scanner;
//1��¼�뿼����Ϣ��Ϣ������������š����ġ���ѧ��Ӣ��ɼ�����������ܳɼ�
public interface IPoints {
	//¼�뿼����Ϣ
   void addPoints(ArrayList<Points>arrayList,Scanner sc);
   //��ѯ����
   void infoPoints(ArrayList<Points>arrayList);
   //������ѯ
   void findByName(ArrayList<Points>arrayList,String name);
   //��Ų�ѯ
   void findByNum(ArrayList<Points>arrayList,String num);
   //���ģ���ѧ��Ӣ���ѯ
   void findBylangmathEng(ArrayList<Points>arrayList,String ceteegory);
   //�����ܳɼ�
   void findBytotal(ArrayList<Points>arrayList,String total);
}
