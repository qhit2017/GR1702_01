import java.util.ArrayList;
import java.util.Scanner;

public interface IScore {

	void helpInfo();

	void addArrayScore(ArrayList<Score> arrayList, Scanner sc);

	void infoArrayScore(ArrayList<Score> arrayList);

	// ��ѯ��߷֣��ܷ���߷֡�������߷�
	void FindMax(ArrayList<Score> arrayList, Scanner sc);

	void Findchinese(ArrayList<Score> arrayList, Scanner sc);

	void Findmath(ArrayList<Score> arrayList, Scanner sc);

	void Findenglish(ArrayList<Score> arrayList, Scanner sc);

}
