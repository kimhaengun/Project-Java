package ch05;

interface Nife{
	void 요리();
	void 상해() ;
}

//어탭터 용도  --> 걸러냄
abstract class 요리사Adapter implements Nife{
	public void 상해() {
		
	}
}

class 백종원 extends 요리사Adapter{

	@Override
	public void 요리() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Adapter01 {
  public static void main(String[] args) {
	
}
}
