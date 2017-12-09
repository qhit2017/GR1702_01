/** 
 * @author  作者 E-mail:
 * @date    创建时间：2017年12月5日 下午5:53:03 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
package com.Test01;

public class Performance {

	// 姓名、编号、语文、数学、英语成绩
	private String name;
	private String id;
	private double language;
	private double math;
	private double English;
	private double sum;

	public Performance() {
	}

	public Performance(String name, String id, double language, double math,
			double english) {
		this.name = name;
		this.id = id;
		this.language = language;
		this.math = math;
		English = english;
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

	public double getLanguage() {
		return language;
	}

	public void setLanguage(double language) {
		this.language = language;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return English;
	}

	public void setEnglish(double english) {
		English = english;
	}
	public double getsum(){
		return sum = language+English+math;
	}

	@Override
	public String toString() {
		return "Performance [name=" + name + ", id=" + id + ", language="
				+ language + ", math=" + math + ", English=" + English + ",sum="+getsum()+"]";
	}

}
