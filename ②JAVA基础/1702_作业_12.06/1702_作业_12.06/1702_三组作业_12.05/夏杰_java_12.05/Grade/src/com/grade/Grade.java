package com.grade;

public class Grade {
	
	private String name;
	
	private String id;
	
	private double EnglishPoints;
	
	private double MathPoints;
	
	private double ChinesePoints;
	
	private double totalPoints;

	public Grade() {
		
		
		
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

	public double getEnglishPoints() {
		return EnglishPoints;
	}

	public void setEnglishPoints(double englishPoints) {
		EnglishPoints = englishPoints;
	}

	public double getMathPoints() {
		return MathPoints;
	}

	public void setMathPoints(double mathPoints) {
		MathPoints = mathPoints;
	}

	public double getChinesePoints() {
		return ChinesePoints;
	}

	public void setChinesePoints(double chinesePoints) {
		ChinesePoints = chinesePoints;
	}

	public double getTotalPoints() {
		return totalPoints = ChinesePoints+MathPoints+EnglishPoints;
		
	}

	@Override
	public String toString() {
		return "Grade [name=" + name + ", id=" + id + ", EnglishPoints="
				+ EnglishPoints + ", MathPoints=" + MathPoints
				+ ", ChinesePoints=" + ChinesePoints + ", totalPoints="
				+ totalPoints + "]";
	}
	
	
	

}
