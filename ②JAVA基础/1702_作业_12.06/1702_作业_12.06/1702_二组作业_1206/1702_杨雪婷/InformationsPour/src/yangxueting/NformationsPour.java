package yangxueting;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/** 
 * @author  ���� qqE-mail:157334005@qq.com
 * @date    ����ʱ�䣺2017��12��5�� ����7:00:59 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class NformationsPour implements InformationsPour{

	private static final char[] Max = null;

	@Override
	public void help() {
		System.out.println("---------�߿���Ϣ�������---------");
		System.out.println("[1]¼�뿼����Ϣ������1");
		System.out.println("[2]��ʾ���п�����Ϣ������2");
		System.out.println("[3]��ʾ�Ӳ˵�3");
		System.out.println("[4]�˳�ϵͳ4");
		
		System.out.println("1��ӡ�ܷ���߷�");
		System.out.println("2��ӡ��ѧ��߷�");
		System.out.println("3��ӡ������߷�");
		System.out.println("4��ӡӢ����߷�");
		System.out.println("5�˳�");
		
	}

	@Override
	public void add(ArrayList<formationsPour> arrayList, Scanner sc) {
		String a = sc.next();
		String[] arrs = a.split(",");
		formationsPour q = new formationsPour(arrs[0], arrs[1], Double.parseDouble(arrs[2]),Double.parseDouble(arrs[3]), Double.parseDouble(arrs[4]));
		arrayList.add(q);
		System.out.println(arrayList.toString());
	}

	public void info(ArrayList<formationsPour> arrayList) {
		for (formationsPour formationsPour : arrayList) {
			System.out.println(formationsPour.toString());
		}
		
	}

	@Override
	public void findmax(ArrayList<formationsPour> arrayList, Scanner sc) {
		double Max=0;
		double temp;
		for (int i = 0; i <arrayList.size(); i++) {
			double china = new formationsPour().getsum();
			if (Max>china) {
				temp=Max;
				Max=china;
				china=temp;
			}
			
		}
		System.out.println(Max);
		
	}


	@Override
	public void findchina(ArrayList<formationsPour> arrayList, Scanner sc) {
		double Max=0;
		double temp;
		for (int i = 0; i <arrayList.size(); i++) {
			double china = arrayList.get(i).getChina();
			if (Max>china) {
				temp=Max;
				Max=china;
				china=temp;
			}
			
		}
		System.out.println(Max);
	}

	@Override
	public void findmath(ArrayList<formationsPour> arrayList, Scanner sc) {
		double Max=0;
		double temp;
		for (int i = 0; i <arrayList.size(); i++) {
			double math=arrayList.get(i).getMath();
			if (Max>math) {
				temp=Max;
				Max=math;
				math=temp;
			}
		}
		System.out.println(Max);
	}

	@Override
	public void findenglish(ArrayList<formationsPour> arrayList, Scanner sc) {
		double Max=0;
		double temp;
		for (int i = 0; i <arrayList.size(); i++) {
			double english=arrayList.get(i).getEnglish();
			if (Max>english) {
				temp=Max;
				Max=english;
				english=temp;
			}
		}
		System.out.println(Max);
	}

}
