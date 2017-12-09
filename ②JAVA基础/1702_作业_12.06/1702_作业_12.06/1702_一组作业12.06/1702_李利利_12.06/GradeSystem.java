public class GradeSystem {
	String name;
	String id;
	double chinesegrade;
	double mathgrade;
	double englishgrade;
	double sungrade;

	public GradeSystem() {

	}

	public GradeSystem(String name, String id, double chinesegrade,
			double mathgrade, double englishgrade) {
		super();
		this.name = name;
		this.id = id;
		this.chinesegrade = chinesegrade;
		this.mathgrade = mathgrade;
		this.englishgrade = englishgrade;
		
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

	public double getChinesegrade() {
		return chinesegrade;
	}

	public void setChinesegrade(double chinesegrade) {
		this.chinesegrade = chinesegrade;
	}

	public double getMathgrade() {
		return mathgrade;
	}

	public void setMathgrade(double mathgrade) {
		this.mathgrade = mathgrade;
	}

	public double getEnglishgrade() {
		return englishgrade;
	}

	public void setEnglishgrade(double englishgrade) {
		this.englishgrade = englishgrade;
	}

	public double getSungrade() {
		return sungrade = chinesegrade + mathgrade + englishgrade;
	}

	@Override
	public String toString() {
		return "GradeSystem [name=" + name + ", id=" + id + ", chinesegrade="
				+ chinesegrade + ", mathgrade=" + mathgrade + ", englishgrade="
				+ englishgrade + ", sungrade=" + getSungrade() + "]";
	}

}
