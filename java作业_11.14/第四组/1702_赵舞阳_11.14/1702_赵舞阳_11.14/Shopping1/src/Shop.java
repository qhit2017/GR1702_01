/*1����������Ա����Ʒ�࣬��ͨ�����ù��췽������ʵ���� 
������Ʒ�࣬��������Ʒ��š����ơ��۸��ͺš����
������ԣ����ṩ������ͬ�Ĺ��췽�������������ģ���
��š����ơ��۸����������ģ�����������Ĺ��췽����
�ֱ�����������췽��ʵ�������󣬲��۲��Ա������ֵ�����
*/
public class Shop {
	int id;                     //��Ʒ���
	String name;                //��Ʒ����
	double price;               //��Ʒ�۸�
	int model;                  //��Ʒ�ͺ�
	String category;            //��Ʒ���
	public Shop(){              //����������
		System.out.println("�����Զ����ɲ���������");	
	}
	public Shop(int id, String name, double price, int model,
			String category) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.model = model;
		this.category = category;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
}
