package com.kong.qinghua;

/**
 * @author ���� E-mail:1299394372@qq.com
 * @date ����ʱ�䣺2017��11��14�� ����8:35:43
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class CategoryTest {
	// ���������Ĺ��췽��ʵ�������󣬲��۲��Ա������ֵ���
	public static void main(String[] args) {

		Category p = new Category();

		System.out.println(p);
		System.out.println();

		// �����������Ĺ��췽��,���۲��Ա������ֵ���
		Category a = new Category("001", "����", 56666);

		System.out.println(a.getSerial());
		System.out.println(a.name);
		System.out.println(a.price);

		System.out.println();

		// ����������Ĺ��췽��,���۲��Ա������ֵ���
		Category s = new Category("001", "����", 56666, "����", "��ͨ����");

		System.out.println(s.getSerial());
		System.out.println(s.name);
		System.out.println(s.price);
		System.out.println(s.model);
		System.out.println(s.category);

	}

}
