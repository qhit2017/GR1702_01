package com.xx;

public class Student {

	private String name;//����
	private String ID;//���
	private double mathscores;//��ѧ�ɼ�
	private double chinesescores;//���ĳɼ�
	private double englishscores;//Ӣ��ɼ�
	private double total;//�ܳɼ�
	//�޲εĹ��췽��
	public Student(){
		
	}
	//�вεĹ��췽��
	public Student(String name, String ID, double mathscores,
			double chinesescores, double englishscores) {
		this.name = name;
		this.ID = ID;
		this.mathscores = mathscores;
		this.chinesescores = chinesescores;
		this.englishscores = englishscores;
		
	}
	//get��set����
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
	//toString����
	@Override
	public String toString() {
		return "Student [������" + name + ",���" + ID + ",��ѧ�ɼ���"
				+ mathscores + ",���ĳɼ�:" + chinesescores
				+ ",Ӣ��ɼ���" + englishscores + ",�ܷ֣�" +getTotal() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
