package yangxueting;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年12月5日 下午7:00:59 
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
		System.out.println("---------高考信息管理帮助---------");
		System.out.println("[1]录入考生信息请输入1");
		System.out.println("[2]显示所有考生信息请输入2");
		System.out.println("[3]显示子菜单3");
		System.out.println("[4]退出系统4");
		
		System.out.println("1打印总分最高分");
		System.out.println("2打印数学最高分");
		System.out.println("3打印语文最高分");
		System.out.println("4打印英语最高分");
		System.out.println("5退出");
		
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
