package com.kyh;

public class MarkingSystem {
	private String name;
	private String id;
	private double ChineseScore;
	private double MathScore;
	private double EnglishScore;
	private double TotalPoints;
	
	
	public MarkingSystem(String name, String id, double chineseScore,
			double mathScore, double englishScore) {
		
		this.name = name;
		this.id = id;
		ChineseScore = chineseScore;
		MathScore = mathScore;
		EnglishScore = englishScore;
		
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


	public double getChineseScore() {
		return ChineseScore;
	}


	public void setChineseScore(double chineseScore) {
		ChineseScore = chineseScore;
	}


	public double getMathScore() {
		return MathScore;
	}


	public void setMathScore(double mathScore) {
		MathScore = mathScore;
	}


	public double getEnglishScore() {
		return EnglishScore;
	}


	public void setEnglishScore(double englishScore) {
		EnglishScore = englishScore;
	}


	public double getTotalPoints() {
		return getChineseScore()+getEnglishScore()+getMathScore();
	}


	@Override
	public String toString() {
		return "MarkingSystem [姓名=" + name + ", 编号=" + id + ", 语文成绩="
				+ ChineseScore + ", 数学成绩=" + MathScore + ", 英语成绩="
				+ EnglishScore + ",总成绩=" + getTotalPoints() + "]";
	}
	
	

}
