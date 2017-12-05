import java.util.ArrayList;
import java.util.Scanner;

public interface IContactsBook {

	void addContacts(ArrayList<Contacts> arrayList, Scanner sc);

	void infoContacts(ArrayList<Contacts> arrayList);

	void findByName(ArrayList<Contacts> arrayList, String Name);

	void findBySex(ArrayList<Contacts> arrayList, String Sex);

	void findByTelnum(ArrayList<Contacts> arrayList, String Telnum);
}
