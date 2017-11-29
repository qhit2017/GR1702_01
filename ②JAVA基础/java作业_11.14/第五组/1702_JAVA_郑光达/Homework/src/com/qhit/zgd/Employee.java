/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年11月14日 下午4:58:57 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.qhit.zgd;

public class Employee {
	String product;
	String RunningWater;
	String production;
	String packaging;
	Employee() {
		System.out.println("流水线生产");
		product = "产品";
		RunningWater= "流水线";
		production= "生产";
		packaging= "包装";
	}

}
