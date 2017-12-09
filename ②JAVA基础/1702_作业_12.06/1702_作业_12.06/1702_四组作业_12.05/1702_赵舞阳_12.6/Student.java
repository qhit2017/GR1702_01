public class Student {
	// ��Ա���� JavaBean
	String name;
	String pid;
	double chinese;
	double math;
	double english;
	double sum;

	// ���췽��
	public Student(String name, String pid, double chinese, double math,
			double english) {
		this.name = name;
		this.pid = pid;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
	}

	// get��set����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
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

	public double getSum() {
		sum = chinese + math + english;
		return sum;
	}

	// ToString����
	@Override
	public String toString() {
		return "Student [name=" + name + ", pid=" + pid + ", chinese="
				+ chinese + ", math=" + math + ", english=" + english
				+ ", sum=" + getSum() + "]";
	}
}
