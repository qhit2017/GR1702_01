package yangxueting;

public class Test {
public static void main(String[] args) {
	//,,100
	PoliceDog j=new PoliceDog();
	j.setVarieties("��������");
	j.setcolour(" yellow");
	j.setAge(8);
	j.setWeight(95);
	j.eyecolor="brown";
	j.fastestspeed=(4);
	j.numberoflegs=(100);
	System.out.println("Ʒ��"+j.getVarieties()+"\n"+"ë����ɫ"+j.getcolour()+"\n"
			                    +"����"+j.getAge()+"\n"+"����"+j.getWeight()+"\n"
			                    +"�۾�����ɫ"+j.eyecolor+"\n"+"�ȵ�����"+j.fastestspeed
			                    +"\n"+"���ʱ��"+j.numberoflegs);
	j.wortk();
	j.eat();
}
}
