package com.qhit;

public class Test {
public static void main(String[] args) {
	//狗的实例化
	DOG dog = new DOG("Dragon", 6);
    dog.breed="藏獒";
    System.out.println(dog.breed);
    dog.colour="黑色";
    System.out.println(dog.colour);
    dog.geteat();
    System.out.println();
    
    //猫的实例化
    Mouse mouse = new Mouse("roar", "波斯猫");
    mouse.leg=4;
    System.out.println(mouse.leg);
    mouse.weight=5;
    System.out.println(mouse.weight);
    mouse.getClass();
    System.out.println();
   
    
}
}
