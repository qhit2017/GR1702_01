package com.XQW;

/**
 * @author 作者 E-mail:757086146@qq.com
 * @date 创建时间：2017年11月13日 下午6:06:45
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Constructor {
	static class Ad {
		String name;
		String register;
		String password;

		void intro() {
			System.out.println("大家好，我是笨笨超市的管理员之一，\n" + "我的名字是：" + name + "\n"
					+ "登录名是：" + register + "\n" + "密码是：" + password);
			System.out.println();
		}
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
					+ price + "\t\t\t" + mnum + "\t\t" + categ);
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
		i.intro();
		System.out.println("我所销售的一款商品详情如下：\n");
		System.out.println("\t\t" + "编号" + "\t" + "名称" + "\t" + "价格" + "\t\t"
				+ "型号" + "\t" + "类别");
		new cm();
		new cm(169, "爱飞行", 6240);
		new cm(169, "爱飞行", 6240, 8013, "可变翼飞行器");

	}

}
