 /**
 *@author  作者 E-mail:996939518@qq.com
 * @date    创建时间：2017年11月16日 上午8:22:01 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Text {

	/*创建一个测试类，实例化一个警犬对象，
	 * 设置警犬品种、毛的颜色、重量、年龄、
	 * 眼睛颜色、腿的数量、最快时速，
	 * 调用它的吃的方法和work方法
	 */
     public static void main(String[] args) {
    	 PoliceDog policeDog =new PoliceDog ("藏獒","白",2,15,4,"蓝色","120");
    	 policeDog.setBreed("藏獒");
             System.out.println("警犬品种:"+policeDog.getBreed());
         policeDog.setColor("白");   
    		 System.out.println("毛的颜色:"+policeDog.getColor());
    	 policeDog.setAge(2);	 
    		 System.out.println("年龄:"+policeDog.getAge());
    	 policeDog.setWeiget(15);	 
    		 System.out.println("重量:"+policeDog.getWeiget());
         policeDog.leg=4;
    		 System.out.println("腿的数量:"+policeDog.leg);
    	 policeDog.eyecolor="蓝色";
    	     System.out.println("眼睛颜色:"+policeDog.eyecolor);
    	 policeDog.speed="120";
    	     System.out.println("最快时速:"+policeDog.speed);
    	     policeDog.eat();
    	     policeDog.work();
    	     
    	     
    	     
    	     
    	 
	}
}
