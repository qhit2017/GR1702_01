

public class jfasflalka {

	public static void main(String[] args) {
		
		lixiaohao a = new lixiaohao();
	
		
		System.out.println("����Ʒ���Ϊ:"+a.number);
		System.out.println("����Ʒ��Ϊ:"+a.name);
		System.out.println("����Ʒ�۸�Ϊ:"+a.price);
		System.out.println("����Ʒ�ͺ�Ϊ:"+a.type);
		System.out.println("����Ʒ���Ϊ:"+a.sort);
		
		System.out.println();
		
		lixiaohao b = new lixiaohao (66,"����ϴ�·�",15.5);
		System.out.println("����Ʒ���Ϊ:"+b.number);  
		System.out.println("����Ʒ��Ϊ:"+b.name);
		System.out.println("����Ʒ�۸�Ϊ:"+b.price);
		System.out.println("����Ʒ�ͺ�Ϊ:"+b.type);
		System.out.println("����Ʒ���Ϊ:"+b.sort);
		
		System.out.println();
		
		lixiaohao c = new lixiaohao (66,"����ϴ�·�",15.5,'A',"������Ʒ");
		System.out.println("����Ʒ���Ϊ:"+c.number);
		System.out.println("����Ʒ��Ϊ:"+c.name);
		System.out.println("����Ʒ�۸�Ϊ:"+c.price);
		System.out.println("����Ʒ�ͺ�Ϊ:"+c.type);
		System.out.println("����Ʒ���Ϊ:"+c.sort);
		
		
	}
}
