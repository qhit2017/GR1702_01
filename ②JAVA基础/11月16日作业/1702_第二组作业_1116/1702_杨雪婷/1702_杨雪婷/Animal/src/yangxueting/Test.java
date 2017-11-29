package yangxueting;

public class Test {
public static void main(String[] args) {
	//,,100
	PoliceDog j=new PoliceDog();
	j.setVarieties("拉布拉多");
	j.setcolour(" yellow");
	j.setAge(8);
	j.setWeight(95);
	j.eyecolor="brown";
	j.fastestspeed=(4);
	j.numberoflegs=(100);
	System.out.println("品种"+j.getVarieties()+"\n"+"毛的颜色"+j.getcolour()+"\n"
			                    +"年龄"+j.getAge()+"\n"+"重量"+j.getWeight()+"\n"
			                    +"眼睛的颜色"+j.eyecolor+"\n"+"腿的数量"+j.fastestspeed
			                    +"\n"+"最快时速"+j.numberoflegs);
	j.wortk();
	j.eat();
}
}
