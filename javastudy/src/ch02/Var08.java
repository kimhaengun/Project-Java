package ch02;

//heap
class Zealot{
	String name = "����";
	int attack = 10;
	int armor = 5;
	static int hp =100;
}

public class Var08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zealot z = new Zealot(); //�� ���ο��� ���� ������. , type=Ŭ������  heap����
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		Zealot z2 = new Zealot();//�� ���ο��� ���� ������.
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		z.attack = 50;
		System.out.println("��ȭ����");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		
		z.hp = 50; //����(static)������ �����͸� �ǵ�� static�� ���� ��� ����
		System.out.println(z.hp);
		System.out.println(z2.hp);
	
		//���� ���׷��̵�
		z.attack=11;
		System.out.println(z.attack);
		System.out.println(z2.attack);
	}

}
