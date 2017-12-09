package com.xx;

public class Student {

	private String name;//姓名
	private String ID;//编号
	private double mathscores;//数学成绩
	private double chinesescores;//语文成绩
	private double englishscores;//英语成绩
	private double total;//总成绩
	//无参的构造方法
	public Student(){
		
	}
	//有参的构造方法
	public Student(String name, String ID, double mathscores,
			double chinesescores, double englishscores) {
		this.name = name;
		this.ID = ID;
		this.mathscores = mathscores;
		this.chinesescores = chinesescores;
		this.englishscores = englishscores;
		
	}
	//get、set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getMathscores() {
		return mathscores;
	}
	public void setMathscores(double mathscores) {
		this.mathscores = mathscores;
	}
	public double getChinesescores() {
		return chinesescores;
	}
	public void setChinesescores(double chinesescores) {
		this.chinesescores = chinesescores;
	}
	public double getEnglishscores() {
		return englishscores;
	}
	public void setEnglishscores(double englishscores) {
		this.englishscores = englishscores;
	}
	public double getTotal() {
		total =  getMathscores()+getChinesescores()+getEnglishscores();
		return total;
	}
	//toString方法
	@Override
	public String toString() {
		return "Student [姓名：" + name + ",编号" + ID + ",数学成绩："
				+ mathscores + ",语文成绩:" + chinesescores
				+ ",英语成绩：" + englishscores + ",总分：" +getTotal() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
