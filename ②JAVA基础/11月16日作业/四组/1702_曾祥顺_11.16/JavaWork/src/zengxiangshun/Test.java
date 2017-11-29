package zengxiangshun;
/** 
 * @author  作者  曾祥顺\张彤彤
 * @date    创建时间：2017年11月16日 上午8:32:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		PoliceDog a = new PoliceDog();
		a.setVariety("哈士奇");
		System.out.println(a.getVariety());
		a.setColour("灰白");
		System.out.println(a.getColour());
		a.setAge(3);
		System.out.println(a.getAge());
		a.setWeight(10.5);
		System.out.println(a.getWeight());
		a.count=4;
		System.out.println(a.count);
		a.hue="黑";
		System.out.println(a.hue);
		a.prestissimo="5km/h";
		System.out.println(a.prestissimo);
		a.eat();
		a.work();
		
	}
}
