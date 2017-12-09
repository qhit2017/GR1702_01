package fcj;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamineService implements IExamine {

	void helpinfo(){
		System.out.println(".....帮助.....");
		System.out.println("1	录入考生的高考信息");
		System.out.println("2	显示所有考生信息");
		System.out.println("3	查询最高分,包括:总分最高分和单科最高分");
		System.out.println("4	退出功能");
	}
	public void addExamine(ArrayList<Examine> arrayList, Scanner sc) {
		 String a = sc.next();
		 String[] b = a.split(",");
		  
		 Examine examine=new Examine(b[0], b[1],
				 Double.parseDouble(b[2]),
				 Double.parseDouble(b[3]),
				 Double.parseDouble(b[4]),
			gettotalpoints()
				 );
		 examine.gettotalpoints();
		 arrayList.add(examine);
		 System.out.println(examine.toString());
		 
	}

	private double gettotalpoints() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void infoExamine(ArrayList<Examine> arrayList) {
		 for (int i = 0; i < arrayList.size(); i++) {
			 Examine examine=arrayList.get(i);
			 System.out.println(examine.toString());
			
		}

	}
	@Override
	public void findByEMExamine(ArrayList<Examine> arrayList,String em) {
		double max = 0;
		if (em.equals("英语")) {
			max = arrayList.get(0).getEnglish();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglish()>max) {
					max=arrayList.get(i).getEnglish();
				}
			
			}
			System.out.println("英语最高分是："+max);}
		
		}
		 
		
	
	@Override
	public void findByCMExamine(ArrayList<Examine> arrayList,String cm) {
		// TODO Auto-generated method stub
		double max = 0;
		if (cm.equals("语文")) {
			max = arrayList.get(0).getChinese();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChinese()>max) {
					max=arrayList.get(i).getChinese();
				}
			
			}
			System.out.println("语文最高分是："+max);}
		
		
	}
	@Override
	public void findByMMExamine(ArrayList<Examine> arrayList,String mm) {
		// TODO Auto-generated method stub
		double max = 0;
		if (mm.equals("数学")) {
			max = arrayList.get(0).getMath();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMath()>max) {
					max=arrayList.get(i).getMath();
				}
			
			}
			System.out.println("数学最高分是："+max);}
		
		
	}
	@Override
	public void findByTMExamine(ArrayList<Examine> arrayList,String tm) {
		// TODO Auto-generated method stub
	 
		
	}

}
