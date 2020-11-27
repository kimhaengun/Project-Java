package composite;

import lombok.Data;

@Data
public class ShrimpBugerSet {
	private ShrimpBurger shrimpbuger;
	private Potato potato;
	private Coke coke;
	public ShrimpBugerSet() {
		this(
				new ShrimpBurger(),
				new Potato(),
				new Coke()
				);
	}
	public ShrimpBugerSet(ShrimpBurger shrimpbuger, Potato potato, Coke coke) {
		this.shrimpbuger=shrimpbuger;
		this.potato=potato;
		this.coke=coke;
		
	}
	
}
