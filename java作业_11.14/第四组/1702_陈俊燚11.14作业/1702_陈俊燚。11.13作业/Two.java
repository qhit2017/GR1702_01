package chenjuniy;



public class Two {

	String notbook; // ����
	String Lenovo;// Ʒ��
	int price; // ����
	void info(){
		System.out.println("����\n\n"
				+"����"+notbook+"\n"
				+"Ʒ��"+Lenovo+"\n"
				+"����"+price+"\n");
}
	public static void main(String[] args) {
		System.out.println("���������ಢʵ������\n");
		Two  p=new Two ();
		p.notbook="�ʼǱ�";
		p.Lenovo="����";
		p.price=5000;
	 }
	}
