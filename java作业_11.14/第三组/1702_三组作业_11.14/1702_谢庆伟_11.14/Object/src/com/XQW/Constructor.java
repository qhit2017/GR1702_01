package com.XQW;

/**
 * @author ���� E-mail:757086146@qq.com
 * @date ����ʱ�䣺2017��11��13�� ����6:06:45
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Constructor {
	static class Ad {
		String name;
		String register;
		String password;

		void intro() {
			System.out.println("��Һã����Ǳ������еĹ���Ա֮һ��\n" + "�ҵ������ǣ�" + name + "\n"
					+ "��¼���ǣ�" + register + "\n" + "�����ǣ�" + password);
			System.out.println();
		}
	}

	static class cm {
		private int snum; // ���
		String name; // ����
		float price; // �۸�
		int mnum; // �ͺ�
		String categ; // ���

		// ��������
		cm() {
			System.out.println("�޲���" + "\t" + snum + "\t\t" + name + "\t"
					+ price + "\t\t\t" + mnum + "\t\t" + categ);
		}

		// ��������
		cm(int snum, String name, float price) {
			this.snum = snum;
			this.name = name;
			this.price = price;
			System.out.println("������" + "\t" + snum + "\t" + name + "\t" + price
					+ "\t" + mnum + "\t\t" + categ);
		}
	
		// �������
		cm(int snum, String name, float price, int mnum, String categ) {
			this.snum = snum;
			this.name = name;
			this.price = price;
			this.mnum = mnum;
			this.categ = categ;
			System.out.println("�����" + "\t" + snum + "\t" + name + "\t" + price
					+ "\t" + mnum + "\t" + categ);
		}
	}

	public static void main(String[] args) {
		System.out.println("\t\t\t\t2017��11��13����ҵ\n");
		System.out.println("һ����������Ա����Ʒ�ࡣ\n");
		
		Ad i = new Ad();
		i.name = "MR";
		i.register = "Mrname";
		i.password = "evolve";
		i.intro();
		System.out.println("�������۵�һ����Ʒ�������£�\n");
		System.out.println("\t\t" + "���" + "\t" + "����" + "\t" + "�۸�" + "\t\t"
				+ "�ͺ�" + "\t" + "���");
		new cm();
		new cm(169, "������", 6240);
		new cm(169, "������", 6240, 8013, "�ɱ��������");

	}

}
