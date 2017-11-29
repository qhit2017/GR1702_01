package com.zk.sjq;
/** 
 * @author  作者 E-mail:chenglong793708@547.com
 * @date    创建时间：2017年11月26日 下午3:02:40 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Square implements Form{
	String length;
	int  perimeter;
	private double areas;
	
	public Square(){
		System.out.println();
	}
	public Square(String length){
	    this.length = length;
	}
	public double getAreas(){
		return areas;
	}
	@Override
	public int perimeter() {
		System.out.println("正方形的周长是");
		return 16;
	}
	@Override
	public String areas() {
		System.out.println("正方形的面积是");
		return "16";
	}
	
	
	

}
