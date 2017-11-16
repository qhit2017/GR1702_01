package chenjuniy;



public class Two {

	String notbook; // 属性
	String Lenovo;// 品牌
	int price; // 单价
	void info(){
		System.out.println("如下\n\n"
				+"属性"+notbook+"\n"
				+"品牌"+Lenovo+"\n"
				+"单价"+price+"\n");
}
	public static void main(String[] args) {
		System.out.println("事物抽象成类并实例化。\n");
		Two  p=new Two ();
		p.notbook="笔记本";
		p.Lenovo="联想";
		p.price=5000;
	 }
	}
