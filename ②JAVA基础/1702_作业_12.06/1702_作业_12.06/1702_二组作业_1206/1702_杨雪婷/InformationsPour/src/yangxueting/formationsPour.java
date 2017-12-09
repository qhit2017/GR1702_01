package yangxueting;
/** 
 * @author  作者 qqE-mail:157334005@qq.com
 * @date    创建时间：2017年12月5日 下午5:09:30 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class formationsPour {

	private String name;
	private String id;
	private double china;
	private double math;
	private double english;
	private double sum;
	public formationsPour() {
		
	}
	public formationsPour(String name, String id, double china, double math,
			double english) {
		this.name = name;
		this.id = id;
		this.china = china;
		this.math = math;
		this.english = english;
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
	public double getChina() {
		return china;
	}
	public void setChina(double china) {
		this.china = china;
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
	public double getsum(){
		sum=china+math+english;
		return sum;
	}
	@Override
	public String toString() {
		return "formationsPour [name=" + name + ", id=" + id + ", china="
				+ china + ", math=" + math + ", english=" + english + ", sum="
				+ getsum() + "]";
	}
	
}
