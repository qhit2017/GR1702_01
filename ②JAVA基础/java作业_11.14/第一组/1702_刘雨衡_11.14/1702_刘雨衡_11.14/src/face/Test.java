package face;

public class Test {
public static void main(String[] args) {
	Category p = new Category();

	System.out.println(p);
	System.out.println();

	Category a = new Category("811", "����¼", 21);

	System.out.println(a.getSerial());
	System.out.println(a.name);
	System.out.println(a.price);

	System.out.println();

	Category s = new Category("811", "����¼", 21, "����", "�ʼǱ�");

	System.out.println("����Ʒ�ı���ǣ�"+s.getSerial());
	System.out.println("����Ʒ�������ǣ�"+s.name);
	System.out.println("����Ʒ�ļ۸��ǣ�"+s.price);
	System.out.println("����Ʒ��Ʒ���ǣ�"+s.model);
	System.out.println("����Ʒ������ǣ�"+s.category);
}
}
