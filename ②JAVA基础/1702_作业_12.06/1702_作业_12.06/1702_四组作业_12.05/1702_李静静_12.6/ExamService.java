package kaoshi1;

import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2004��1��1�� ����8:44:38 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ExamService implements IExam {
	void hellp(){
		System.out.println("ѧ�����Գɼ�����ϵͳ");
		System.out.println("1      ����һ����Ϣ");
		System.out.println("2      ��ʾ������Ϣ");
		System.out.println("3      �ܷ�");
		System.out.println("4      �˳�");
	}
	
	void hellp1(){
		System.out.println("1	��ӡ�ܷ���߷�");
		System.out.println("2	��ӡ��ѧ��߷�");
		System.out.println("3	��ӡ������߷�");
		System.out.println("4	��ӡӢ����߷�");
		System.out.println("5       �˳�");
	}

	//����
	@Override
	public void add(ArrayList<Exam> a, Scanner sc) {
		String e = sc.next();
		String[] e1 = e.split(",");
		if (e1.length!=5) {
			System.out.println("�����������д");
		} else {
			Exam e2 = new Exam(e1[0], e1[1], Integer.parseInt(e1[2]), Integer.parseInt(e1[3]), Integer.parseInt(e1[4]));
			a.add(e2);
			System.out.println(e2.toString()+e2.getTotal());
		}
		
	}

	//����
	@Override
	public void info(ArrayList<Exam> a) {
		for (Exam exam : a) {
			System.out.println(exam.toString()+exam.getTotal());
		}

	}

	//�ܷ�
	@Override
	public void find(ArrayList<Exam> a) {
		int max=a.get(0).getTotal();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getTotal()>max) {
				max=a.get(i).getTotal();
			}
		}
		System.out.println("��߷֣�"+max);

	}

	//����
	@Override
	public void find1(ArrayList<Exam> a) {
		int max=a.get(0).getLanguage();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getLanguage()>max) {
				max=a.get(i).getLanguage();
			}
		}
		System.out.println("��߷֣�"+max);


	}

	//��ѧ
	@Override
	public void find2(ArrayList<Exam> a) {
		int max=a.get(0).getMathematics();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getMathematics()>max) {
				max=a.get(i).getMathematics();
			}
		}
		System.out.println("��߷֣�"+max);

	}

	//Ӣ��
	@Override
	public void find3(ArrayList<Exam> a) {
		int max=a.get(0).getEnglish();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getEnglish()>max) {
				max=a.get(i).getEnglish();
			}
		}
		System.out.println("��߷֣�"+max);

	}

}
