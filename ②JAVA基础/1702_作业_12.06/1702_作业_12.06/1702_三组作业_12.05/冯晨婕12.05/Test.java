package fcj;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<Examine> arrayList = new ArrayList<Examine>();
		ExamineService examineService = new ExamineService();
		Scanner sc = new Scanner(System.in);
		examineService.helpinfo();
		int key ;
		boolean isquit = true;
		while (isquit) {
			 key=sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("1��¼�뿼����Ϣ��Ϣ����������" + "��š�" + "���ġ���ѧ��Ӣ��ɼ���"
						+ "��������ܳɼ�");
				examineService.addExamine(arrayList, sc);
				break;
			case 2:
				System.out.println("��ʾ���п�����Ϣ����������" + "��š����ġ�" + "��ѧ��Ӣ��ɼ����ܳɼ�");
				examineService.infoExamine(arrayList);
				break;
			case 3:
				System.out.println("3�����û�ѡ��3ʱ������ʾһ���Ӳ˵���");
				System.out.println("1	��ӡ�ܷ���߷�");
				System.out.println("2	��ӡ��ѧ��߷�");
				System.out.println("3	��ӡ������߷�");
				System.out.println("4	��ӡӢ����߷�");
				System.out.println("5	�˳�");
				System.out.println("�����Ӧ��������ʾ��Ӧ����������5���˳���������");
				break;
			case 4:
				System.out.println("4���˳����ܿ����˳�ϵͳ");
				isquit = false;
				break;
			default:
				System.out.println("�������������Ч");
				break;

			}
		}
		System.out.println("�ݰݣ���");

	}

}
