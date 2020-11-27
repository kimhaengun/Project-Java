package ch04;

class  dog {
	int 배고픔 = 100; //상태
	
	void eat() { //행위
		배고픔 = 10;
	}
}


public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog d1 = new dog();
		//d1.배고픔=10; <--마법 / 하면안돼!
		d1.eat(); //올바른 표기법
		System.out.println("강아지 배고픔 :"+d1.배고픔);
	}//end of main
}
