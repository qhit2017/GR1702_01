package com.lyl.qhit;

public class Student {
	// 1��¼�뿼����Ϣ��Ϣ������������š����ġ���ѧ��Ӣ��ɼ�����������ܳɼ�
	private String name;// ��������
	private String serialnumber;// ���
	private double Chinesescore;// ���ĳɼ�
	private double mathscore;// ��ѧ�ɼ�
	private double Englishscore;// Ӣ��ɼ�
	private double sum;// �ܷ�

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
