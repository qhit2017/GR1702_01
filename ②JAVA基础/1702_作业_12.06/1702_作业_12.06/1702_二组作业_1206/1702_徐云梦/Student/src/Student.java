
public class Student {
	private String name;//名字
	private String id;//学号
	private double Chinese;//语文成绩
	private double Math;//数学成绩
	private double English;//英语成绩
	private double total;//总成绩
	
	
	
	public Student() {
		super();
	}


	public Student(String name, String id, double chinese, double math,
			double english, double total) {
		super();
		this.name = name;
		this.id = id;
		Chinese = chinese;
		Math = math;
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

	public double getChinese() {
		return Chinese;
	}

	public void setChinese(double chinese) {
		Chinese = chinese;
	}

	public double getMath() {
		return Math;
	}

	public void setMath(double math) {
		Math = math;
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
		return "Student [name=" + name + ", id=" + id + ", Chinese=" + Chinese
				+ ", Math=" + Math + ", English=" + English + ", total="
				+ total + "]";
	}
	
	
	
}