package ch04;

class  dog {
	int ����� = 100; //����
	
	void eat() { //����
		����� = 10;
	}
}


public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d1 = new dog();
		//d1.�����=10; <--���� / �ϸ�ȵ�!
		d1.eat(); //�ùٸ� ǥ���
		System.out.println("������ ����� :"+d1.�����);
	}//end of main
}
