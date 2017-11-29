
public class DogTest  {
	public static void main(String[] args) {
		Dog s=new Dog();
		s.setBreed("拉布拉多犬");
		System.out.println("狗的品种是:"+s.getBreed());
		s.setColour("黄色");
		System.out.println("狗的颜色是:"+s.getColour());
        s. setAge(6);
        System.out.println("狗的年龄是:"+ s.getAge());
        s.setWeight(23);
        System.out.println("狗的体重是:"+s.getWeight());
        s.eyecolor="白色";
        System.out.println("眼睛颜色:"+s.eyecolor);
        s.legs=4;
      
        s.eat();
        s.sleep();
        s.wow();
	}

}
