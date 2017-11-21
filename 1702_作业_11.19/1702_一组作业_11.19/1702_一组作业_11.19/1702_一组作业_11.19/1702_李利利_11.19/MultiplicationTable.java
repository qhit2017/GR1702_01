public class MultiplicationTable {
	public static void main(String[] args) {
		// µÚÊ®Ìâ
		int y = 1;
		while (y <= 9) {
			int o = 1;
			while (o <= y) {
				System.out.print(o + "*" + y + "=" + y * o + "\t");
				o++;
			}
			System.out.println();
			y++;
		}
	}
}
