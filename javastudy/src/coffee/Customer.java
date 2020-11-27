package coffee;

//고객
//책임 : 메뉴를 주문, 먹기()
public class Customer {
	
	public void order(Barista b1) {
		//바리스타에게 메시지를 보냄
		Coffee c = b1.makeCoffee();
		System.out.println(c.getName()+"음료가 나왔습니다.");
	}

}
