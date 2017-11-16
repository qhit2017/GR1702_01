package xiajie;

public class BasktballTest {
	
	public static void main(String[] args) {
		/*String name;
	    String hight;
	    int age;
	    String post;*/
		Basktball b = new Basktball("李军","2米11",21,"中锋" );
		
		System.out.println("姓名：" + b.name);
		System.out.println("身高" + b.hight);
		System.out.println("年龄：" + b.age);
		System.out.println("职位" + b.post);
		
	}

}
