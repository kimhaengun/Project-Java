package star1;

class DarkTempler extends StarUnit{
	String name;
	int hp;
	int attack;
	public DarkTempler(String name, int hp, int attack) {
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
