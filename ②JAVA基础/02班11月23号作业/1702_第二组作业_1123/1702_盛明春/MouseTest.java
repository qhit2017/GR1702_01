package person;

public class MouseTest {
	public static void main(String[] args) {
Mouse mouse1 =new Mouse("����","��˿��");
Mouse mouse2 =new Mouse();
mouse2.setLeg(4);
mouse2.setWeight(3);
System.out.println("����:"+mouse1.getName()+"\n"
		+"Ʒ��:"+mouse1.getBreed()+"\n"
		+"����:"+mouse2.getLeg()+"\n"
		+"����:"+mouse2.getWeight());
System.out.println(mouse2.geteat()+"\n"+mouse2.getcry());
}
}
