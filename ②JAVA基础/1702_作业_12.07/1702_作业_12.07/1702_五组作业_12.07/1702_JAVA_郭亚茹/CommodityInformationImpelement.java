package Com.commodity;

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
public class CommodityInformationImpelement implements
		ICommodityInformationInterface {
       void help(){
    	   System.out.println("-----��ѯ����ϵͳ-----");
    	   System.out.println("��1��  ������Ʒ������add");
    	   System.out.println("��2�� ����������get");
    	   System.out.println("��3��   ����������sell");
    	   System.out.println("��4���ο����������info");
    	   System.out.println("��5��   �˳�����������exit");
       }
	@Override
	public void addCommodityInformation(
			ArrayList<CommodityInformation> arrayList, Scanner sc) {

		String string = sc.next();
		String[] a = string.split(",");
		if (a.length != 4) {
			System.out.println("�Բ���������ĸ�ʽ�������������롣");
		} else {
			CommodityInformation commodityInformation = new CommodityInformation(
					a[0], a[1], Double.parseDouble(a[2]),
					Double.parseDouble(a[3]));
			arrayList.add(commodityInformation);
			System.out.println(arrayList.toString());
			System.out.println("��ӳɹ���");
		}

	}

	@Override
	public void getCommodityInformation(
			ArrayList<CommodityInformation> arrayList, Scanner sc) {
		//2��������������Ʒ��ź����������д˱����Ʒ����������Ӧ��������û������ʾ����ʧ�ܡ�
		System.out.println("��������Ʒ���");
		String y = sc.next();
		
		boolean isCommodityId = false;
		
		for (int i = 0; i <arrayList.size(); i++) {
			
			String t = arrayList.get(i).getCommodityId();
			
			if (t.equals(y)) {
				
				System.out.println("�������������");
				
				int r = sc.nextInt();
				
				arrayList.get(i).setCommoditynumber(arrayList.get(i).getCommoditynumber()+r);
				
				System.out.println("����������Ϊ:"+arrayList.get(i).getCommoditynumber());
				
				isCommodityId = true;
			}
			
			if (!isCommodityId) {
				System.out.println("����ʧ�ܣ�");
			}
			
		}
		
		

	}

	@Override
	public void sellCommodityInformation(
			ArrayList<CommodityInformation> arrayList, Scanner sc) {
		//3�����ۣ�������Ʒ��ź����������д˱����Ʒ����Ʒ�������������������������Ӧ������������ʾ����ʧ�ܡ�
		System.out.println("��������Ʒ���");
			String string = sc.next();
			boolean isnull=false;
			for (int i = 0; i < arrayList.size(); i++) {
				 String d = arrayList.get(i).getCommodityId();
				if (string.equals(d)) {
					System.out.println("��������������");
					int y = sc.nextInt();
					double l = arrayList.get(i).getCommoditynumber();
					if (y<l) {
						arrayList.get(i).setCommoditynumber(l-y);
						
						System.out.println("���ۺ������Ϊ��"+arrayList.get(i).getCommoditynumber());
						isnull=true;
					} 
						if (!isnull) {
							System.out.println("����ʧ�ܣ�");
						

					}
					
				}
				
			}
	}

	@Override
	public void infoCommodityInformation(
			ArrayList<CommodityInformation> arrayList, Scanner sc) {
		for (CommodityInformation commodityInformation : arrayList) {
			System.out.println(commodityInformation.toString());
			
		}
		}

	}


