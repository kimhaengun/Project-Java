package test;

import ch05.BlueCloth;
import ch05.Factory;

//protected는 같은 패키지 + 자식만 상속
public class FactoryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory f1 = new BlueCloth();
//		f1.색칠(); //동적 바인딩(자식 함수 실행)
//		f1.건조();
		f1.가동();
	}

}
