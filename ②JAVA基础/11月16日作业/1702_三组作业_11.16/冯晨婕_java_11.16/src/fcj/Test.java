/**
 * 
 */
package fcj;
import java.util.Scanner;

/**
 * @author ���ߣ�  E-mail:2570804732@qq.com
 * @date ����ʱ�䣺16 Nov 2017 7:55:30 Ekuseni
 * @version 1.0
 * @parameter
 * @since
 * @return
 * @function
 */
/**
 * @author Administrator
 *
 */
public class Test {
public static void main(String[] args) {
	//����һ�������࣬ʵ����һ����Ȯ����
	//���þ�ȮƷ�֡�ë����ɫ�����������䡢�۾���ɫ��
	//�ȵ����������ʱ�٣�
    //�������ĳԵķ�����work����
	Dog2 a =new Dog2("����"," ��", 3,30 ,"��",4,120);
	a.setBreed("����");
	System.out.println("��Ȯ��Ʒ�֣�"+a.getBreed());
	a.setColor("��");
	System.out.println("��Ȯ����ɫ��"+a.getColor());
	a.setWeigth(30);
	System.out.println("��Ȯ��������"+a.getWeigth());
	a.setAge(3);
	System.out.println("��Ȯ�����䣺"+a.getAge());
	a.eyecolor=("��");
	System.out.println("��Ȯ�۾�����ɫ��"+a.eyecolor);
	a.legs=4;
	System.out.println("��Ȯ�ȵ�����: "+a.legs);
	a.speed=120;
	System.out.println("���ʱ��"+a.speed+"��ÿ����");
	//����
	a.eat();
	a.work();
}
}
