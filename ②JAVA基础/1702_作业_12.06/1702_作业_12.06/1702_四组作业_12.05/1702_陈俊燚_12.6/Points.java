//ʵ����
package com.qhit;

public class Points {
//	������Ϣ����������š����ġ���ѧ��Ӣ��ܳɼ���
	private String name;
	private double number;
	private String language;
	private String math;
	private String English;
    double totalscore;
	
	//�޲ι��췽��
	public Points() {
		super();
	}

	//�вι��췽��
	public Points(String name, double number, String language, String math,
			String english, double grade, double totalscore) {
		super();
		this.name = name;
		this.number = number;
		this.language = language;
		this.math = math;
		English = english;
		this.totalscore = totalscore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getEnglish() {
		return English;
	}

	public void setEnglish(String english) {
		English = english;
	}

	public double getTotalscore() {
		return totalscore;
	}

	public void setTotalscore(double totalscore) {
		this.totalscore = totalscore;
	}

	@Override
	public String toString() {
		return "Points [name=" + name + ", number=" + number + ", language="
				+ language + ", math=" + math + ", English=" + English
				+ ",  totalscore=" + totalscore + "]";
	}
	
}
