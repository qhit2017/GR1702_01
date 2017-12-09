package kaoshi;

public class Student {
	private String name;// 姓名
	private String id;// 学号
	private double Chineses;// 语文成绩
	private double mathematic;// 数学成绩
	private double English;// 英语成绩
	private double total = Chineses + mathematic + English;// 总成绩
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
