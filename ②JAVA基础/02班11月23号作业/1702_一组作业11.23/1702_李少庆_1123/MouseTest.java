package animal;

public class MouseTest {
public static void main(String[] args) {
	
	Mouse x=new Mouse("С��","����");
	x.setWeight("1kg");
	x.setLegs("4");
	System.out.println("�ǳƣ�"+x.getName());
	System.out.println("�����ȣ�"+x.getLegs());
	System.out.println("���أ�"+x.getWeight());
	System.out.println("Ʒ�֣�"+x.getBreed());
	
	System.out.println(x.getEat());
	System.out.println(x.getCall());
	
}
}
