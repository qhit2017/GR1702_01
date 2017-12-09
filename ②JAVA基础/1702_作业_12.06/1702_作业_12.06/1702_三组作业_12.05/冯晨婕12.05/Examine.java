package fcj;

public class Examine {
	private String name;
	private String number;
	private double chinese;
	private double math;
	private double english;
	private double totalpoints;
	
	public Examine() {
		super();
	}

	public Examine(String name, String number, double chinese, double math,
			double english, double totalpoints) {
		super();
		this.name = name;
		this.number = number;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.totalpoints = totalpoints;
		
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

	 

	public double gettotalpoints(){
		totalpoints = english+math+ chinese;
		return totalpoints;}

	@Override
	public String toString() {
		return "Examine [name=" + name + ", number=" + number + ", chinese="
				+ chinese + ", math=" + math + ", english=" + english
				+ ", totalpoints=" + totalpoints + "]";
	}
	
	
}
