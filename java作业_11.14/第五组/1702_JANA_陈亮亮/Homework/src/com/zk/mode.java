package com.zk;
/**�����ߣ�������
 *����ʱ�䣺2017��11��14������10:22:33
 *���䣺2507147605@qq.com
 */
public class mode {
public static void main(String[] args) {
	
	Commodity a =new Commodity();
	System.out.println("�����޲���");
	System.out.println(a.color);
	System.out.println(a.name);
	System.out.println(a.price);
	System.out.println(a.model);
	System.out.println(a.category);
	
	Commodity b =new Commodity("��ɫ","�ں�",9.5);
	System.out.println("������������");
	System.out.println(b.color);
	System.out.println(b.name);
	System.out.println(b.price);
	
	Commodity c =new Commodity("��ɫ","�ں�",9.5,"007","��ױƷ");
	System.out.println("�����������");
	System.out.println(c.color);
	System.out.println(c.name);
	System.out.println(c.price);
	System.out.println(c.model);
	System.out.println(c.category);
	
}
}
