package com.XQW;
/** 
 * @author  ���� E-mail:757086146@qq.com
 * @date    ����ʱ�䣺2017��11��13�� ����8:55:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Abstract {
String name;  //����
String gender;  //�Ա�
int age;  //����
int height;  //���
int weight;  //����
String pro;  //ְҵ
void info(){
	System.out.println("�� ������Ϣ Ϊһ�࣬ʵ�����£�\n\n"
			+ "������"+name+"\n"
			+ "�Ա�"+gender+"\n"
			+"���䣺"+age+"\n"
			+"��ߣ�"+height+"cm"+"\n"
			+ "���أ�"+weight+"kg"+"\n"
			+ "ְҵ��"+pro);
}

	public static void main(String[] args) {
		System.out.println("������һ�� �������ಢʵ������\n");
		Abstract p=new Abstract();
		p.name="��ĳ";
		p.gender="��";
		p.age=50;
		p.height=169;
		p.weight=55;
		p.pro="�����ܲ�";
		p.info();

	}

}
