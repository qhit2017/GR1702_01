package fcj;

import java.util.ArrayList;
import java.util.Scanner;

public class ExamineService implements IExamine {

	void helpinfo(){
		System.out.println(".....����.....");
		System.out.println("1	¼�뿼���ĸ߿���Ϣ");
		System.out.println("2	��ʾ���п�����Ϣ");
		System.out.println("3	��ѯ��߷�,����:�ܷ���߷ֺ͵�����߷�");
		System.out.println("4	�˳�����");
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
		if (em.equals("Ӣ��")) {
			max = arrayList.get(0).getEnglish();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getEnglish()>max) {
					max=arrayList.get(i).getEnglish();
				}
			
			}
			System.out.println("Ӣ����߷��ǣ�"+max);}
		
		}
		 
		
	
	@Override
	public void findByCMExamine(ArrayList<Examine> arrayList,String cm) {
		// TODO Auto-generated method stub
		double max = 0;
		if (cm.equals("����")) {
			max = arrayList.get(0).getChinese();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getChinese()>max) {
					max=arrayList.get(i).getChinese();
				}
			
			}
			System.out.println("������߷��ǣ�"+max);}
		
		
	}
	@Override
	public void findByMMExamine(ArrayList<Examine> arrayList,String mm) {
		// TODO Auto-generated method stub
		double max = 0;
		if (mm.equals("��ѧ")) {
			max = arrayList.get(0).getMath();
			for (int i = 1; i < arrayList.size(); i++) {
				if (arrayList.get(i).getMath()>max) {
					max=arrayList.get(i).getMath();
				}
			
			}
			System.out.println("��ѧ��߷��ǣ�"+max);}
		
		
	}
	@Override
	public void findByTMExamine(ArrayList<Examine> arrayList,String tm) {
		// TODO Auto-generated method stub
	 
		
	}

}
