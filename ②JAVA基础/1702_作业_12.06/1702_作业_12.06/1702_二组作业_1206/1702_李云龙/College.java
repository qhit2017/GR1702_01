package zk.college.com;

public class College {

	private String name;//����
	private String number;//���
	private double language;//����
	private double mathematics;//��ѧ
	private double English;//Ӣ��
	private double points;//�ܳɼ�
	
	public College() {
		super();
	}

	public College(String name, String number, double language,
			double mathematics, double english) {
		super();
		this.name = name;
		this.number = number;
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
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

	public double getPoints() {
		return points;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", number=" + number + ", language="
				+ language + ", mathematics=" + mathematics + ", English="
				+ English + ", points=" + points + "]";
	}

}
