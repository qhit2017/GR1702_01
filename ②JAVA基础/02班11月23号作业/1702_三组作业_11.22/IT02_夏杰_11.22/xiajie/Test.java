package com.xiajie;
/**
 * @author  ����  E����mai l:�̽�/�Ľ� 2564963490@QQ.com/378901749
 * @date    ����ʱ��: 2017��11��23�� ����8:30:28
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @functin
 */
public class Test {
	
	public static void main(String[] args) {
		
		Dog d = new Dog("С��");
		System.out.println("С�������֣�"+d.getName());
		
		Mouse m = new Mouse("�ܿ�","������");
		System.out.println("�����������:"+m.getName());
		System.out.println("�����������:"+m.getKind());
		
		d.eat();
		d.Wow();
		
		m.eat();
		m.Wow();
	}

}
