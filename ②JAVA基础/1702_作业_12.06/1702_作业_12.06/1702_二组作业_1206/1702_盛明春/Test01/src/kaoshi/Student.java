package kaoshi;

public class Student {
	private String name;// ����
	private String id;// ѧ��
	private double Chineses;// ���ĳɼ�
	private double mathematic;// ��ѧ�ɼ�
	private double English;// Ӣ��ɼ�
	private double total = Chineses + mathematic + English;// �ܳɼ�
	public Student(String name, String id, double chineses, double mathematic,
			double english, double total) {
		super();
		this.name = name;
		this.id = id;
		Chineses = chineses;
		this.mathematic = mathematic;
		English = english;
		this.total = total;
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
	public double getChineses() {
		return Chineses;
	}
	public void setChineses(double chineses) {
		Chineses = chineses;
	}
	public double getMathematic() {
		return mathematic;
	}
	public void setMathematic(double mathematic) {
		this.mathematic = mathematic;
	}
	public double getEnglish() {
		return English;
	}
	public void setEnglish(double english) {
		English = english;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", Chineses="
				+ Chineses + ", mathematic=" + mathematic + ", English="
				+ English + ", total=" + total + "]";
	}
	
	

}
