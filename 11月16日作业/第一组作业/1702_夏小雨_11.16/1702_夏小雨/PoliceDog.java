package xiaxiaoyu;

public class  PoliceDog extends Dog{
	/*
	����һ���ࣺ��Ȯ ���̳е�һ����ࣺ��
    ���ԣ����ʱ��
	������work
	*/
	
	String fastspeed;
	public PoliceDog(int leg, String color, String kind, String haircolor,
			int age, String weight, String fastspeed) {
		super(leg, color, kind, haircolor, age, weight);
		this.fastspeed = fastspeed;
	}
	void work(){
		System.out.println("ҧ����");
	}
}
