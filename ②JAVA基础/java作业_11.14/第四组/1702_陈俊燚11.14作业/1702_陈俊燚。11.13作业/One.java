package chenjuniy;

//��������Ա����Ʒ�࣬��ͨ�����ù��췽������ʵ���� 
//������Ʒ�࣬��������Ʒ��š����ơ��۸��ͺš����������ԣ�
// ����������Ĺ��췽�����ֱ�����������췽��ʵ�������󣬲��۲��Ա������ֵ�����
public class One {
	static class Ad {
		String name;
		String register;
		String password;
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
					+ price + "\t" + mnum + "\t\t" + categ);
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
		
		System.out.println("�������۵�һ����Ʒ�������£�\n");
		System.out.println("\t\t" + "���" + "\t" + "����" + "\t" + "�۸�" + "\t\t"
				+ "�ͺ�" + "\t" + "���");
		new cm();
		new cm(169, "��Ƥ��", 6240);
		new cm(169, "�̲�+����", 6240, 8013, "���㽶�ƿϵ»�");

	}
}