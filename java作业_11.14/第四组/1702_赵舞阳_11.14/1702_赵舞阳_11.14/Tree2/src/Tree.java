//2��˼�����������Щ������Գ�����ಢ������һ���������ಢʵ��������
public class Tree {
String name;
int weight;
	Tree(String name,int weight){
	this.name=name;
	this.weight=weight;
	}
	public static void main(String[] args) {
		System.out.println("�ڶ���:");
		Tree a = new Tree("����",80);
		System.out.println("�ҵ�����:"+a.name+"\n"
				+"�ҵ�����"+a.weight+"\n");
	}
}
