package ch04;

public class Person {
	String name;
	String job;
	int age;
	char gender;
	String blood;
	
	//����Ʈ �����ڴ� �����ڰ� �ϳ��� ������ �����Ϸ��� �ڵ����� �������.
	//���� �����ڰ� ������ ����Ʈ �����ڸ� ��������� ����.
	//�̰�쿡�� ����Ʈ �����ڸ� ���� �������� ��.(�����ε�)
	public Person() {
		// TODO Auto-generated constructor stub
		
	}
	
	//�ʱ�ȭ�� ���� ������ (�ʱ�ȭ�� ���� �Լ�)
	public Person(String a, String b, int c, char d, String e) {
		// TODO Auto-generated constructor stub
		System.out.println("����� �¾");
		name = a;
		job= b;
		gender = d;
		age = c;
		blood = e;
		
	}
	
	void perview() {
		System.out.println("===="+name+"====");
		System.out.println("����:"+job);
		System.out.println("����:"+age);
		System.out.println("����:"+gender);
		System.out.println("������:"+blood);
		System.out.println() ;//�������� <br/>
	}
}
