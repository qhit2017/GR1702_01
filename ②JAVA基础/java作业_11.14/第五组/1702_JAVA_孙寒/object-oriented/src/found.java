public class found {

	int number;// 商品编号
	String name;// 名称
	int  price;// 价格
	char model;// 型号
	int category;// 类别

	found() {
		System.out.println("不带参的：");
	}

	found(int numberA, String nameA, int d) {
		System.out.println("三个带参的：");

		number = numberA;
		name = nameA;
		price = d;

	}

	found(int numberS, String nameS, int priceS, char modelS, int categoryS) {
		System.out.println("五个带参的:");
		number = numberS;
		name = nameS;
		price = priceS;
		model = modelS;
		category = categoryS;
	}

}
