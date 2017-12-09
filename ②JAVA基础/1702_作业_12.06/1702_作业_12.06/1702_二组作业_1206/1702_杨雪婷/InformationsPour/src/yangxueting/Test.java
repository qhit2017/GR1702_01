package yangxueting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 作者 qqE-mail:157334005@qq.com
 * @date 创建时间：2017年12月5日 下午7:02:33
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
public class Test {

	public static void main(String[] args) {
		ArrayList<formationsPour> arrayList = new ArrayList<formationsPour>();

		NformationsPour nformationsPour = new NformationsPour();
		Scanner sc = new Scanner(System.in);
		nformationsPour.help();
		boolean isQuit = true;
		while (isQuit) {

			System.out.println("请输入命令并按回车键！");
			String key = sc.next();
			switch (key) {
			case "1":

				System.out.println("请输入考生信息");

				nformationsPour.add(arrayList, sc);
				break;

			case "2":
				System.out.println("请输入所有考生信息");
				nformationsPour.info(arrayList);

				break;
			case "3":
			boolean	isQuit1=true;
				while (isQuit1) {
					String as=sc.next(); 
					switch (as) {
					case "1":
						nformationsPour.findmax(arrayList, sc);
						break;
					case "2":
						nformationsPour.findmath(arrayList, sc);
						break;
					case "3":
						nformationsPour.findchina(arrayList, sc);
						break;
					case "4":
						nformationsPour.findenglish(arrayList, sc);
						break;
					case "5":
						isQuit1=false;
						break;
					default:
						break;
					}
				}
			case "4":

				isQuit1 = false;
			default:
				break;
			}

		}
		System.out.println("已退出程序！");
	}
}
