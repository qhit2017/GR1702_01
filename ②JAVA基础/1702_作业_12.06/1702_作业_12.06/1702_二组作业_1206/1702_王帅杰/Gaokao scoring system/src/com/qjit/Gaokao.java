package com.qjit;

public class Gaokao {

	private String name;
	private String id;
	private double language;
	private double mathematics;
	private double English;
	private double total;
	
	public Gaokao() {
		super();
	}

	public Gaokao(String name, String id, double language, double mathematics,
			double english) {
		super();
		this.name = name;
		this.id = id;
		this.language = language;
		this.mathematics = mathematics;
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

	public double getMathematics() {
		return mathematics;
	}

	public void setMathematics(double mathematics) {
		this.mathematics = mathematics;
	}

	public double getEnglish() {
		return English;
	}

	public void setEnglish(double english) {
		English = english;
	}

	public double getTotal() {
		return getEnglish()+getMathematics()+getLanguage();
	}

	

	@Override
	public String toString() {
		return "Gaokao [name=" + name + ", id=" + id + ", language=" + language
				+ ", mathematics=" + mathematics + ", English=" + English
				+ ", total=" + getTotal() + "]";
	}
	
	
	
	
	
	
}
