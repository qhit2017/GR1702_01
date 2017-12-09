public class Score {

	// ��������š����ġ���ѧ��Ӣ��ɼ����ܳɼ�
	private String name;
	private String id;
	private double chinese;
	private double math;
	private double english;
	private double totalpoints;

	// �޲εĹ��췽����
	public Score() {
	}

	// �вεĹ��췽����
	public Score(String name, String id, double chinese, double math,
			double english) {
		this.name = name;
		this.id = id;
		this.chinese = chinese;
		this.math = math;
		this.english = english;

	}

	// ����Set get������
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

	// ����������ܷ֣�
	public double sum() {
		return chinese + math + english;
	}

	// ����toString������
	@Override
	public String toString() {
		return "Score [name=" + name + ", id=" + id + ", chinese=" + chinese
				+ ", math=" + math + ", english=" + english + ", totalpoints="
				+ sum() + "]";
	}

}
