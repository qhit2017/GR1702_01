/** 
 * @author  ���� E-mail:
 * @date    ����ʱ�䣺2017��11��15�� ����8:24:26 
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
		System.out.println("����");
	}

}
