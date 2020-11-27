package composite;

public class BigBurger extends Burger{
	
	public BigBurger() {
		this(2000,"ºò ¹ö°Å");
	}
	public BigBurger(int price,String desc) {
		super(price, desc);
	}
}
