package Com.Test;

/**
 * @author 作者 E-mail:1561061182@qq.com
 * @date 创建时间：2017年11月8日 下午6:44:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Performance {
	// 录入考试信息信息包含姓名、编号、语文、数学、英语成绩
	private String name;
	private String id;
	private double chineseScore;
	private double mathScore;
	private double EnglishScore;
	private double sum;

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

	public double getChineseScore() {
		return chineseScore;
	}

	public void setChinese(double chineseScore) {
		this.chineseScore = chineseScore;
	}

	public double getMathScore() {
		return mathScore;
	}

	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}

	public double getEnglish() {
		return EnglishScore;
	}

	public void setEnglish(double EnglishScore) {
		this.EnglishScore = EnglishScore;
	}
	

	public double getSum() {
		
		sum = chineseScore+mathScore+EnglishScore;
		return sum;
	}

	public Performance() {

	}


	public Performance(String name, String id, double chineseScore,
			double mathScore, double englishScore) {
		this.name = name;
		this.id = id;
		this.chineseScore = chineseScore;
		this.mathScore = mathScore;
		EnglishScore = englishScore;
	}

	@Override
	public String toString() {
		return "Performance [name=" + name + ", id=" + id + ", chinese="
				+ chineseScore + ", mathScore=" + mathScore + ", EnglishScore="
				+ EnglishScore + ",sum="
				+ getSum() + "]";
	}

}
