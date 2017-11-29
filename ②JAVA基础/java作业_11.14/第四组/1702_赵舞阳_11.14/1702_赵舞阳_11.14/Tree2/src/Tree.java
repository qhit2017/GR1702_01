//2、思考你身边有哪些事物可以抽象成类并把其中一个创建成类并实例化对象。
public class Tree {
String name;
int weight;
	Tree(String name,int weight){
	this.name=name;
	this.weight=weight;
	}
	public static void main(String[] args) {
		System.out.println("第二题:");
		Tree a = new Tree("大树",80);
		System.out.println("我的名字:"+a.name+"\n"
				+"我的体重"+a.weight+"\n");
	}
}
