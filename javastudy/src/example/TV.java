package example;

import example.TV;

class TV {
	private String name;
	private int year;
	private int inch;
	
	public TV(String name, int year, int inch) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.year = year;
		this.inch = inch;
	
	}
	void show() {
		System.out.println(name+"���� ���� "+year+"���� "+inch+"��ġ TV");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV("LG",2017,32);
		myTV.show();
		
	}
}
