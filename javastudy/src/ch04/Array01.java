package ch04;

class User{
	 static int id;
	 static String name;
	 static String phone;
	
	public User(int id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		User.id = id;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		User.name = name;
	}
	public static String getPhone() {
		return phone;
	}
	public static void setPhone(String phone) {
		User.phone = phone;
	}
	
}




public class Array01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] users = new User[3];
		users[0] = new User(1,"È«±æµ¿","0102222");
		users[1] = new  User(2,"ÀÓ²©Á¤","0103333");
		users[2] = new User(3,"Àåº¸°í","0104444");
		
	 System.out.println(users[0].getName());
	
	
	}

}
