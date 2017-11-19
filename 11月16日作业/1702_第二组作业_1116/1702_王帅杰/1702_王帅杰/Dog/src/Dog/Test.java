package Dog;
/** 
 * @author  作者 E-mail:738348954@qq.com
 * @date    创建时间：2017年11月15日 下午8:33:24 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
public static void main(String[] args) {
	policeDog dog =new policeDog();
	dog.setBreed("哈士奇");
	dog.setColour("黑色");
	dog.setWeight(30);
	dog.setAge(6);
	dog.eye ="蓝色";
	dog.leg=4;
	dog.speed="50km/h";
	System.out.println("该狗的品种为："+dog.getBreed());
	System.out.println("颜色为："+dog.getColour());
	System.out.println("体重为:"+dog.getWeight());
	System.out.println("年龄为:"+dog.getAge());
	System.out.println("眼睛颜色为："+dog.eye);
	System.out.println("警犬腿数量为："+dog.leg);
	System.out.println("时速为：" +dog.speed);
	dog.eat();
	dog.work();
	
}
}
