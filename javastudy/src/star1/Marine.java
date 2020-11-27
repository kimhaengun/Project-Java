package star1;

class Marine {
	//맴버 변수 = *필드* = heap변수 = 전역변수 = 속성 = *프로퍼티*
	// field, property는 private로 만든다. 마법이 적용 안댐!!
	
	private String name;
	private int hp;
	private int attack;
	
	//this = 알트 + 쉬프트 + S
	public Marine(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	
	
  public Marine() {
	// TODO Auto-generated constructor stub
}	
	
}
