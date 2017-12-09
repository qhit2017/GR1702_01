package com.examgrade;
/** 
 * @author  作者 E-mail:757086146@qq.com
 * @date    创建时间：2017年12月4日 下午7:06:18 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class ExamScore {

	private String name;
	private String id;
	private double china;
	private double math;
	private double english;
	private double sum;
	public ExamScore() {
	}
	public ExamScore(String name, String id, double china, double math,
			double english,double sum) {
		this.name = name;
		this.id = id;
		this.china = china;
		this.math = math;
		this.english = english;
		this.sum=sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getChina() {
		return china;
	}
	public void setChina(double china) {
		this.china = china;
	}
	public double getMath() {
		return math;
	}
	public void setMath(double math) {
		this.math = math;
	}
	public double getEnglish() {
		return english;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public double getsum(){
		sum=china+math+english;
		return sum;
	}
	@Override
	public String toString() {
		return "ExamScore [name=" + name + ", id=" + id + ", china=" + china
				+ ", math=" + math + ", english=" + english + ", sum="
				+ getsum() + "]";
	}
	
}
