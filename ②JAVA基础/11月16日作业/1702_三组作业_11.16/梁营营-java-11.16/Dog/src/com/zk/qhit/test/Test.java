package com.zk.qhit.test;
//��ҵ�ģ�
//���ߣ���ӪӪ��
public class Test {
	
public static void main(String[] args) {
	
	PliceDog dog = new PliceDog("��", "��ɫ", 2, 6);
	System.out.println(dog.getBreed());
	System.out.println(dog.getColor());
	System.out.println(dog.getAge());
	System.out.println(dog.getWeight());
	System.out.println(dog.eyecolor);
	System.out.println(dog.legs);
	System.out.println(dog.speed);
	dog.eat();
	dog.work();
}

}
