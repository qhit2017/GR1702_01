package com.achievement;

public class Achievement {

	private String name;	//姓名
	private String number;	//编号
	private double language;//语文
	private double mathematics;//数学
	private double english;	//英语
	private double Totalscore;	//总成绩



	public Achievement() {
		
	}


	public Achievement(String name, String number, double language,
			double mathematics, double english) {
		super();
		this.name = name;
		this.number = number;
		this.language = language;
		this.mathematics = mathematics;
		this.english = english;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public double getLanguage() {
		return language;
	}


	public void setLanguage(double language) {
		this.language = language;
	}


	public double getMathematics() {
		return mathematics;
	}


	public void setMathematics(double mathematics) {
		this.mathematics = mathematics;
	}


	public double getEnglish() {
		return english;
	}


	public void setEnglish(double english) {
		this.english = english;
	}
	
	public double getTotalscore(){
		
		return Totalscore = language + mathematics+ english;
	}


	@Override
	public String toString() {
		return "Achievement [name=" + name + ", number=" + number
				+ ", language=" + language + ", mathematics=" + mathematics
				+ ", english=" + english + ", Totalscore=" + this.getTotalscore() + "]";
	}
	
	
	
	
	
	
}
