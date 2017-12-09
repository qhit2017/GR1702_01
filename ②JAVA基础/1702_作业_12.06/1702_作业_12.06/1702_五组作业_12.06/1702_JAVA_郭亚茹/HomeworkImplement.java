package Com.Test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ���� E-mail:1561061182@qq.com
 * @date ����ʱ�䣺2017��11��8�� ����6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class HomeworkImplement implements HomeworkInterface {
	void helps() {
		System.out.println("---������ѯ����ϵͳ---");
		System.out.println("��1��  ¼�뿼���ɼ���Ϣ������1");
		System.out.println("��2 ����ѯ�����ɼ���Ϣ������3");
		System.out.println("��3 �� �����Ӳ˵�������3");
		System.out.println("��4 ���˳�ϵͳ������4 ");

	}

	@Override
	public void help() {
		System.out.println("---��������ѯ����ϵͳ---");
		System.out.println("��1��  ��ӡ�ܷ���߷�������1");
		System.out.println("��2 ����ӡ��ѧ��߷�������2");
		System.out.println("��3 �� ��ӡ������߷�������3");
		System.out.println("��4 ����ӡӢ����߷�������14");
		System.out.println("��5 ���������˵�������5");

	}

	@Override
	public void addPerformance(ArrayList<Performance> arrayList, Scanner sc) {
		String string = sc.next();
		String[] a = string.split(",");
		if (a.length !=5) {
			
			System.out.println("�������ʽ������������룡");
			
		} else {
			Performance Performance = new Performance(a[0], a[1],
					Double.parseDouble(a[2]), Double.parseDouble(a[3]),
					Double.parseDouble(a[4]));
			arrayList.add(Performance);
			System.out.println(arrayList.toString());
		}

	}

	@Override
	public void infoPerformance(ArrayList<Performance> arrayList) {
		for (Performance performance : arrayList) {
			System.out.println(performance.toString());
		}

	}

	@Override
	public void topscorePerformance(ArrayList<Performance> arrayList, String Grade) {
		
		double Max = 0;
	if (Grade.equals("�ܳɼ�")) {
		Max = arrayList.get(0).getSum();
		
		for (int i =1; i <arrayList.size(); i++) {
			if (arrayList.get(i).getSum()>Max) {
				
				Max = arrayList.get(i).getSum();
				
			}
			
		}
		System.out.println(Max);
	}
	
	if (Grade.equals("����")) {
		Max = arrayList.get(0).getChineseScore();
		
		for (int i =1; i <arrayList.size(); i++) {
			if (arrayList.get(i).getChineseScore()>Max) {
				
				Max = arrayList.get(i).getChineseScore();
				
			}
			
		}
		System.out.println(Max);
	}
	if (Grade.equals("��ѧ")) {
		Max = arrayList.get(0).getMathScore();
		
		for (int i =1; i <arrayList.size(); i++) {
			if (arrayList.get(i).getMathScore()>Max) {
				
				Max = arrayList.get(i).getMathScore();
				
			}
			
		}
		System.out.println(Max);
	}
	if (Grade.equals("Ӣ��")) {
		Max = arrayList.get(0).getEnglish();
		
		for (int i =1; i <arrayList.size(); i++) {
			if (arrayList.get(i).getEnglish()>Max) {
				
				Max = arrayList.get(i).getEnglish();
				
			}
			
		}
		System.out.println(Max);
	}

	}
}
