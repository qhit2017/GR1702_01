package com.zk;
/**制作者：陈亮亮
 *制作时间：2017年11月14日上午10:22:33
 *邮箱：2507147605@qq.com
 */
public class mode {
public static void main(String[] args) {
	
	Commodity a =new Commodity();
	System.out.println("这是无参数");
	System.out.println(a.color);
	System.out.println(a.name);
	System.out.println(a.price);
	System.out.println(a.model);
	System.out.println(a.category);
	
	Commodity b =new Commodity("红色","口红",9.5);
	System.out.println("这是三个参数");
	System.out.println(b.color);
	System.out.println(b.name);
	System.out.println(b.price);
	
	Commodity c =new Commodity("红色","口红",9.5,"007","化妆品");
	System.out.println("这是五个参数");
	System.out.println(c.color);
	System.out.println(c.name);
	System.out.println(c.price);
	System.out.println(c.model);
	System.out.println(c.category);
	
}
}
