package com.qhit;

public class Examinee {
	
	private String Name;//����
	private String SerialNumber;//���
	private double LanguageGrade;//���ĳɼ�
	private double MathematicsGrade;//��ѧ�ɼ�
	private double EnglishGrade;//Ӣ��ɼ�
	private double Total;//�ܷ�
	
	
	public Examinee(String name, String serialNumber, double languageGrade,
			double mathematicsGrade, double englishGrade) {
		
		Name = name;
		SerialNumber = serialNumber;
		LanguageGrade = languageGrade;
		MathematicsGrade = mathematicsGrade;
		EnglishGrade = englishGrade;
		
	}


	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}


	public String getSerialNumber() {
		return SerialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		SerialNumber = serialNumber;
	}


	public double getLanguageGrade() {
		return LanguageGrade;
	}
	public void setLanguageGrade(double languageGrade) {
		LanguageGrade = languageGrade;
	}


	public double getMathematicsGrade() {
		return MathematicsGrade;
	}
	public void setMathematicsGrade(double mathematicsGrade) {
		MathematicsGrade = mathematicsGrade;
	}


	public double getEnglishGrade() {
		return EnglishGrade;
	}
	public void setEnglishGrade(double englishGrade) {
		EnglishGrade = englishGrade;
	}

    
	public double getTotal() {
		
		Total = LanguageGrade+MathematicsGrade+EnglishGrade;
		return Total;
	}


	@Override
	public String toString() {
		return "Examinee [Name=" + Name + ", SerialNumber=" + SerialNumber
				+ ", LanguageGrade=" + LanguageGrade + ", MathematicsGrade="
				+ MathematicsGrade + ", EnglishGrade=" + EnglishGrade
				+ ", Total=" + getTotal()+"]";
	}

	
	
}
