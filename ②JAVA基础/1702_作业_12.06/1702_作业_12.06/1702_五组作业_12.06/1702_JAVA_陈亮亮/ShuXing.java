package com.homework;

/**
 * �����ߣ������� ����ʱ�䣺2017��12��7������8:10:48 ���䣺2507147605@qq.com
 */
public class ShuXing {
	// ��������š����ġ���ѧ��Ӣ��ɼ�����������ܳɼ�
	private String name;
	private String id;
	private double chinese;
	private double math;
	private double English;
	private double sum;

	public ShuXing() {
	}

	public ShuXing(String name, String id, double chinese, double math,
			double english, double sum) {
		this.name = name;
		this.id = id;
		this.chinese = chinese;
		this.math = math;
		English = english;
		this.sum = sum;
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

	public double getChinese() {
		return chinese;
	}

	public void setChinese(double chinese) {
		this.chinese = chinese;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public double getEnglish() {
		return English;
	}

	public void setEnglish(double english) {
		English = english;
	}

	public double getsum() {
		sum = chinese + math + English;
		
		return sum;
	}

	@Override
	public String toString() {
		return "ShuXing [name=" + name + ", id=" + id + ", chinese=" + chinese
				+ ", math=" + math + ", English=" + English + ", sum=" + getsum()
				+ "]";
	}

}
