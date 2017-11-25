package person;

public class MouseTest {
	public static void main(String[] args) {
Mouse mouse1 =new Mouse("杰瑞","金丝熊");
Mouse mouse2 =new Mouse();
mouse2.setLeg(4);
mouse2.setWeight(3);
System.out.println("名称:"+mouse1.getName()+"\n"
		+"品种:"+mouse1.getBreed()+"\n"
		+"腿数:"+mouse2.getLeg()+"\n"
		+"体重:"+mouse2.getWeight());
System.out.println(mouse2.geteat()+"\n"+mouse2.getcry());
}
}
