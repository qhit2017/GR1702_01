package D2TI;
/*�����ˣ�����
 *����ʱ�䣺2017��11��21������7:04:54
 *���䣺2408368509@qq.com
 */

public class Test {   
	
	
	public static void main(String[] args) {
		Student w = new Student("��С��", 20);
		System.out.println("������"+w.name);
		System.out.println("���䣺"+w.age);
		System.out.println("ְҵ��"+w.getContent());
		
		
		Worker x = new Worker("Сӣ", 16);
		System.out.println("������"+x.name);
		System.out.println("���䣺"+x.age);
		System.out.println("ְҵ��"+x.getContent());
	
		
	}
	
}
     //��ͬ��һ��˵��һ��д�����������������û��������Ҳд������