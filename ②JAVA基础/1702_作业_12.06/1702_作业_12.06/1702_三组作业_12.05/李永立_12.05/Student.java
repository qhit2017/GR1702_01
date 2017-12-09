package com.lyl.qhit;

public class Student {
	// 1、录入考试信息信息包含姓名、编号、语文、数学、英语成绩，并计算出总成绩
	private String name;// 考生姓名
	private String serialnumber;// 编号
	private double Chinesescore;// 语文成绩
	private double mathscore;// 数学成绩
	private double Englishscore;// 英语成绩
	private double sum;// 总分

	public Student() {
		super();
	}

	public Student(String name, String serialnumber, double chinesescore,
			double mathscore, double englishscore, double sum) {
		super();
		this.name = name;
		this.serialnumber = serialnumber;
		Chinesescore = chinesescore;
		this.mathscore = mathscore;
		Englishscore = englishscore;
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	public double getChinesescore() {
		return Chinesescore;
	}

	public void setChinesescore(double chinesescore) {
		Chinesescore = chinesescore;
	}

	public double getMathscore() {
		return mathscore;
	}

	public void setMathscore(double mathscore) {
		this.mathscore = mathscore;
	}

	public double getEnglishscore() {
		return Englishscore;
	}

	public void setEnglishscore(double englishscore) {
		Englishscore = englishscore;
	}

	public double getSum() {
		sum = Chinesescore+mathscore+Englishscore;
		return sum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", serialnumber=" + serialnumber
				+ ", Chinesescore=" + Chinesescore + ", mathscore=" + mathscore
				+ ", Englishscore=" + Englishscore + ", sum=" + getSum() + "]";
	}

	
	

}
