package ch04;

//�ڹ� Ư¡ : ��� �ڵ�� class ���ο� �־� �Ѵ�.
public class method01 {
	// heap ����
	static void add() {
		System.out.println("add�Լ� ȣ���");
	}
	void sound() {
		System.out.println("sound �Լ� ȣ���");
	}
	
	public static void main(String[] args) {
		//stack ����
		method01.add();
		
		method01 m = new method01();
		m.sound();
	}//end of main
}
