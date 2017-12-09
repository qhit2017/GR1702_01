import java.util.ArrayList;
import java.util.Scanner;

public interface IScore {

	void helpInfo();

	void addArrayScore(ArrayList<Score> arrayList, Scanner sc);

	void infoArrayScore(ArrayList<Score> arrayList);

	// 查询最高分：总分最高分、单科最高分
	void FindMax(ArrayList<Score> arrayList, Scanner sc);

	void Findchinese(ArrayList<Score> arrayList, Scanner sc);

	void Findmath(ArrayList<Score> arrayList, Scanner sc);

	void Findenglish(ArrayList<Score> arrayList, Scanner sc);

}
