package composite;

import lombok.Data;

//��������
@Data
public class BugerSet {
	private Burger burger;
	private Potato potato;
	private Coke coke;
	public BugerSet() {
		this(
				new Burger(),
				new Potato(),
				new Coke()
				);
	}
	public BugerSet(Burger burger, Potato potato, Coke coke) {
		super();
		this.burger = burger;
		this.potato = potato;
		this.coke = coke;
	}
	
	
}
