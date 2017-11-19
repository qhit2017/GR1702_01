package com.zk.qhit.test;
//作业四；
//作者：梁营营；
public class Test {
	
public static void main(String[] args) {
	
	PliceDog dog = new PliceDog("狗", "黄色", 2, 6);
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
