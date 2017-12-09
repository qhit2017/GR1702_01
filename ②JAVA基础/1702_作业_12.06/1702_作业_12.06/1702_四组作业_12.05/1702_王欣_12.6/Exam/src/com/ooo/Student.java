package com.ooo;

/*制作人：王欣
 *日期2017年12月5日时间下午4:47:34
 *邮箱:2408368509@qq.com
 */

public class Student {
	private String name;
	private String id;
	private double english;
	private double chiese;
	private double math;
	private double score;
	
	public Student(String name, String id, double english, double chiese,
			double math, double score) {
		super();
		this.name = name;
		this.id = id;
		this.english = english;
		this.chiese = chiese;
		this.math = math;
		this.score = score;
	}

	public Student() {
		super();
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

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getChiese() {
		return chiese;
	}

	public void setChiese(double chiese) {
		this.chiese = chiese;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getScore() {
		return math+chiese+english;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", english=" + english
				+ ", chiese=" + chiese + ", math=" + math + ", score=" + math+chiese+english
				+ "]";
	}
	
	
	

}
