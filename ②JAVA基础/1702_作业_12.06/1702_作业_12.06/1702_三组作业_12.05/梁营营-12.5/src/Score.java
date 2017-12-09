public class Score {

	// 姓名、编号、语文、数学、英语、成绩、总成绩
	private String name;
	private String id;
	private double chinese;
	private double math;
	private double english;
	private double totalpoints;

	// 无参的构造方法；
	public Score() {
	}

	// 有参的构造方法；
	public Score(String name, String id, double chinese, double math,
			double english) {
		this.name = name;
		this.id = id;
		this.chinese = chinese;
		this.math = math;
		this.english = english;

	}

	// 创建Set get方法；
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String Id) {
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
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getTotalpoints() {
		return totalpoints;
	}

	public void setTotalpoints(double totalpoints) {
		this.totalpoints = totalpoints;
	}

	// 各科相加求总分；
	public double sum() {
		return chinese + math + english;
	}

	// 创建toString方法；
	@Override
	public String toString() {
		return "Score [name=" + name + ", id=" + id + ", chinese=" + chinese
				+ ", math=" + math + ", english=" + english + ", totalpoints="
				+ sum() + "]";
	}

}
