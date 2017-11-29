
package com.Form;
/** 
 * @author  作者 E-mail:1603559382@qq.com
 * @date    创建时间：2017年11月25日 下午3:08:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {

	public static void main(String[] args) {
		Square square = new Square(2.5);
		System.out.println("正方形周长:"+square.getPerimeter());
		System.out.println("正方形面积:"+square.getArea());
		Trapezoid zoid = new Trapezoid(3,4);
		zoid.height=1.5;
		zoid.left=1.5;
		zoid.right=2.3;
		System.out.println("梯形的周长"+zoid.getPerimeter());
		System.out.println("梯形的面积"+zoid.getArea());
	}
}
