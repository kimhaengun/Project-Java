package star1;

class Dragoon extends StarUnit{
	private String name;
	private int hp;
	private int attack;
	
	public Dragoon() {
		// TODO Auto-generated constructor stub
	}
	public Dragoon(String name, int hp, int attack) {
		super();
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}

	
	
}
