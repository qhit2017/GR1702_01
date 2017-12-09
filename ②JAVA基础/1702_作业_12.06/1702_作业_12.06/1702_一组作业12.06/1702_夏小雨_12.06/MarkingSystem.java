package com.xxy;

public class MarkingSystem {
	private String name;
	private String num;
	private double language;
	private double mathematics;
	private double english;
	private double number;
	
	
	public MarkingSystem() {
		super();
	}

	public MarkingSystem(String name, String num, double language,
			double mathematics, double english,double number) {
		super();
		this.name = name;
		this.num = num;
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

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
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

	public double getNumber() {
		return language+english+mathematics;
	}

	public void setNumber(double number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "MarkingSystem [name=" + name + ", num=" + num + ", language="
				+ language + ", mathematics=" + mathematics + ", english="
				+ english + ", number=" + language+english+mathematics + "]";
	}



	
}
