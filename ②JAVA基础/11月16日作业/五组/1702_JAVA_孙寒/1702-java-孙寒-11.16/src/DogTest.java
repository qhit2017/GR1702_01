
public class DogTest  {
	public static void main(String[] args) {
		Dog s=new Dog();
		s.setBreed("��������Ȯ");
		System.out.println("����Ʒ����:"+s.getBreed());
		s.setColour("��ɫ");
		System.out.println("������ɫ��:"+s.getColour());
        s. setAge(6);
        System.out.println("����������:"+ s.getAge());
        s.setWeight(23);
        System.out.println("����������:"+s.getWeight());
        s.eyecolor="��ɫ";
        System.out.println("�۾���ɫ:"+s.eyecolor);
        s.legs=4;
      
        s.eat();
        s.sleep();
        s.wow();
	}

}
