package example;

class Rectangle {
	private int x, y, width, height;
	
	public Rectangle(int x, int y, int width, int height) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	int square(int width, int height) {
		// TODO Auto-generated method stub
		int s =width*height;
		return s;
	}
	
	boolean contains(Rectangle r) {
		return true;

	}
	void show() {
		System.out.println("("+x+","+y+") ���� ũ�Ⱑ"+width+"x"+height+"�� �簢��");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s= new Rectangle(5, 5, 6, 6);
		Rectangle t= new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������"+s.square(s.width,s.height));
		if (t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if (t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}



}
