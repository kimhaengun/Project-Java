package ch04;

//static�� ó������ ����
//static�� �ϳ� �ۿ� ����.(ó�� �����Ҷ� �ѹ� �θ�.)
//ctrl+shift+f ����
//�޼���(�Լ�) �ȿ� �޼���(�Լ�)�� ������ �� ����.
//������ �޼��带 ���� �� ����.
public class Method04 {
	
	int money = 10000; //heap
	
	int add(int num ) {// int num stack, add() = heap 
		int money2 = money+num;
		return money2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method04 m = new Method04();
		m.add(50000);
		System.out.println(m.money);
		
		int money2 = m.add(50000);
		System.out.println(money2);
	}

}