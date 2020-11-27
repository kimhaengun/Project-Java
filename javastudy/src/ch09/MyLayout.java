package ch09;


public enum MyLayout {
	WEST("West","¼­ÂÊ"), 
	EAST("East"), 
	SOUTH("South"), 
	NORTH("North"),
	CENTER("Center");
	
	private String value;
	private String value2;
	
	public String getValue() {
		return value;
	}
	private MyLayout(String value) {
		this.value = value;
	}
	private MyLayout(String value, String value2) {
		this.value = value;
		this.value2 =value2;
	}
	
}
