package kaoshi1;

/**
 * @author ���� ����˳\��ͮͮ
 * @date ����ʱ�䣺2004��1��1�� ����8:07:52
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Exam {

	private String name;// ����
	private String number;// ���
	private int language;// ����
	private int mathematics;// ��ѧ
	private int English;// Ӣ��
	private int total;// �ܷ�

	public Exam(String name, String number, int language, int mathematics,
			int english) {
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

	public int getLanguage() {
		return language;
	}

	public void setLanguage(int language) {
		this.language = language;
	}

	public int getMathematics() {
		return mathematics;
	}

	public void setMathematics(int mathematics) {
		this.mathematics = mathematics;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public int getTotal() {
		total = English + mathematics + language;
		return total;
	}

	@Override
	public String toString() {
		return "Exam [name=" + name + ", number=" + number + ", language="
				+ language + ", mathematics=" + mathematics + ", English="
				+ English + "]"+"�ܷ�=";
	}
	
}
