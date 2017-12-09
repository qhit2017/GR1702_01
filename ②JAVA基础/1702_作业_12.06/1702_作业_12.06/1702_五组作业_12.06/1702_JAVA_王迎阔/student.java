package com.system;
/**
 * @author  作者 E-mail:1456014420@qq.com
 * @date    创建时间：2017年11月27日 下午4:24:12 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class student {

	private String name;
	private String id;
	private double LanguageScore;
	private double MathematicsScore;
	private double EnglishScore;
	private double totalScore;
	
	
	
	public student() {
		
	}

	public student(String name, String id, double languageScore,
			double mathematicsScore, double englishScore, double totalScore) {
		super();
		this.name = name;
		this.id = id;
		LanguageScore = languageScore;
		MathematicsScore = mathematicsScore;
		EnglishScore = englishScore;
		this.totalScore = totalScore;
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


	public double getLanguageScore() {
		return LanguageScore;
	}


	public void setLanguageScore(double languageScore) {
		LanguageScore = languageScore;
	}


	public double getMathematicsScore() {
		return MathematicsScore;
	}


	public void setMathematicsScore(double mathematicsScore) {
		MathematicsScore = mathematicsScore;
	}


	public double getEnglishScore() {
		return EnglishScore;
	}


	public void setEnglishScore(double englishScore) {
		EnglishScore = englishScore;
	}


	public double getTotalScore() {
		totalScore =LanguageScore + MathematicsScore + EnglishScore;
		return totalScore;
	}


	


	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + ", LanguageScore="
				+ LanguageScore + ", MathematicsScore=" + MathematicsScore
				+ ", EnglishScore=" + EnglishScore + ", totalScore="
				+ getTotalScore() + "]";
	}
	
	
	
	
	
}
