package D2TI;
/*制作人：王欣
 *制作时间：2017年11月21日下午7:04:54
 *邮箱：2408368509@qq.com
 */

public class Test {   
	
	
	public static void main(String[] args) {
		Student w = new Student("王小明", 20);
		System.out.println("姓名："+w.name);
		System.out.println("年龄："+w.age);
		System.out.println("职业："+w.getContent());
		
		
		Worker x = new Worker("小樱", 16);
		System.out.println("姓名："+x.name);
		System.out.println("年龄："+x.age);
		System.out.println("职业："+x.getContent());
	
		
	}
	
}
     //我同桌一边说我一边写，这道题我连看懂都没看懂，我也写不出来