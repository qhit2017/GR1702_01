package com.qhit;

public class Test {
public static void main(String[] args) {
	//����ʵ����
	DOG dog = new DOG("Dragon", 6);
    dog.breed="����";
    System.out.println(dog.breed);
    dog.colour="��ɫ";
    System.out.println(dog.colour);
    dog.geteat();
    System.out.println();
    
    //è��ʵ����
    Mouse mouse = new Mouse("roar", "��˹è");
    mouse.leg=4;
    System.out.println(mouse.leg);
    mouse.weight=5;
    System.out.println(mouse.weight);
    mouse.getClass();
    System.out.println();
   
    
}
}
