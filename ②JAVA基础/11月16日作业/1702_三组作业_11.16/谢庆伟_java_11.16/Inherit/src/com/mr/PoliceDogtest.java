package com.mr;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年11月15日 下午9:13:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class PoliceDogtest {

	public static void main(String[] args) {
		PoliceDog tq=new PoliceDog();
		tq.setBreed("德国牧羊犬");
		tq.setChaetacolor("黑黄色");
		tq.setWeight(18);
		tq.setAge(5);
		tq.eyescolor="黑色";
		tq.legsnum=4;
		tq.fastspeed=26.04;
		System.out.println("品种："+tq.getBreed());
		System.out.println("毛的颜色："+tq.getChaetacolor());
		System.out.println("重量："+tq.getWeight()+"kg");
		System.out.println("年龄："+tq.getAge()+"岁");
		System.out.println("眼睛颜色："+tq.eyescolor);
		System.out.println("腿肢体的数量："+tq.legsnum);
		System.out.println("最快时速："+tq.fastspeed+"km/hour");
		tq.feed();
		tq.work();

	}

}
