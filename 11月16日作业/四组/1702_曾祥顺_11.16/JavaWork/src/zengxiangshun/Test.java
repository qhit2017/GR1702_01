package zengxiangshun;
/** 
 * @author  ����  ����˳\��ͮͮ
 * @date    ����ʱ�䣺2017��11��16�� ����8:32:48 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 * @function
 */
public class Test {
	public static void main(String[] args) {
		PoliceDog a = new PoliceDog();
		a.setVariety("��ʿ��");
		System.out.println(a.getVariety());
		a.setColour("�Ұ�");
		System.out.println(a.getColour());
		a.setAge(3);
		System.out.println(a.getAge());
		a.setWeight(10.5);
		System.out.println(a.getWeight());
		a.count=4;
		System.out.println(a.count);
		a.hue="��";
		System.out.println(a.hue);
		a.prestissimo="5km/h";
		System.out.println(a.prestissimo);
		a.eat();
		a.work();
		
	}
}
