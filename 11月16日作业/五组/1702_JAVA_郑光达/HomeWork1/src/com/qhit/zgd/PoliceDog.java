/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月15日 下午8:24:26 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class PoliceDog extends Dog {
	String Speedperhour;

	public PoliceDog(String PingZhong, String maocolor, int age,
			String TiZhong, String speedperhour, int number, String YanJingcolor) {
		Speedperhour = speedperhour;
	}

	void work() {
		System.out.println("工作");
	}

}
