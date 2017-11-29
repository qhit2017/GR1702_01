package chenjuniy;

//创建管理员与商品类，并通过调用构造方法进行实例化 
//创建商品类，并给出商品编号、名称、价格、型号、类别五个属性，
// 带五个参数的构造方法；分别调用三个构造方法实例化对象，并观察成员变量赋值情况；
public class One {
	static class Ad {
		String name;
		String register;
		String password;
	}

	static class cm {
		private int snum; // 编号
		String name; // 名称
		float price; // 价格
		int mnum; // 型号
		String categ; // 类别

		// 不带参数
		cm() {
			System.out.println("无参数" + "\t" + snum + "\t\t" + name + "\t"
					+ price + "\t" + mnum + "\t\t" + categ);
		}

		// 三个参数
		cm(int snum, String name, float price) {
			this.snum = snum;
			this.name = name;
			this.price = price;
			System.out.println("三参数" + "\t" + snum + "\t" + name + "\t" + price
					+ "\t" + mnum + "\t\t" + categ);
		}
	
		// 五个参数
		cm(int snum, String name, float price, int mnum, String categ) {
			this.snum = snum;
			this.name = name;
			this.price = price;
			this.mnum = mnum;
			this.categ = categ;
			System.out.println("五参数" + "\t" + snum + "\t" + name + "\t" + price
					+ "\t" + mnum + "\t" + categ);
		}
	}

	public static void main(String[] args) {
		System.out.println("\t\t\t\t2017年11月13日作业\n");
		System.out.println("一、创建管理员与商品类。\n");
		
		Ad i = new Ad();
		i.name = "MR";
		i.register = "Mrname";
		i.password = "evolve";
		
		System.out.println("我所销售的一款商品详情如下：\n");
		System.out.println("\t\t" + "编号" + "\t" + "名称" + "\t" + "价格" + "\t\t"
				+ "型号" + "\t" + "类别");
		new cm();
		new cm(169, "脆皮鸡", 6240);
		new cm(169, "奶茶+汉堡", 6240, 8013, "大香蕉牌肯德基");

	}
}