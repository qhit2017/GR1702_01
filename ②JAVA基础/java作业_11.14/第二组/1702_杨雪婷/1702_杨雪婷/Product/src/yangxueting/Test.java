package yangxueting;

public class Test {

	public static void main(String[] args) {
		Product h=new Product();
		System.out.println("����Ʒ��Ϊ:"+h.name);
		System.out.println("����Ʒ���Ϊ:"+h.number);
		System.out.println("����Ʒ�۸�Ϊ:"+h.price);
		System.out.println("����ƷΪ:"+h.model);
		System.out.println("����Ʒ����Ϊ:"+h.category);
		System.out.println();
		
		Product g=new Product("�ʼǱ�",6,6);
		System.out.println("����Ʒ��Ϊ:"+g.name);
		System.out.println("����Ʒ���Ϊ:"+g.number);
		System.out.println("����Ʒ�۸�Ϊ:"+g.price);
		System.out.println("����ƷΪ:"+g.model);
		System.out.println("����Ʒ����Ϊ:"+g.category);
		System.out.println();
		
		Product j=new Product("�ʼǱ�",6,6,"ӲƤ��","���ñʼ�");
		System.out.println("����Ʒ��Ϊ:"+j.name);
		System.out.println("����Ʒ���Ϊ:"+j.number);
		System.out.println("����Ʒ�۸�Ϊ:"+j.price);
		System.out.println("����ƷΪ:"+j.model);
		System.out.println("����Ʒ����Ϊ:"+j.category);
		
	}		
}
