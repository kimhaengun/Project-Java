package ch06;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		//���ڿ��� ����(����) ǥ�� length()
		System.out.println(a+"�� ���̴� "+a.length());
		//���ڿ��� ���� ���� contains() #�� a���� ���ԵǾ����� Ȯ�� ����
		System.out.println(a.contains("#"));
		//���� �����ϱ� concat()
		a = a.concat(b);
		System.out.println(a);
		//���ڿ� �� �� ���� ���� trim()
		a = a.trim();
		System.out.println(a);
		//���ڿ� ��ġ(����) replace(���� ��, ���� ��)
		a=a.replace("C#","Java");
		System.out.println(a);
		//���ڿ� �и� split(�и� ����)
		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++) 
			System.out.println("�и��� ���ڿ�"+i+":"+s[i]);
		//�ε��� 5���� ������ ��� substring()
		a=a.substring(5);
		System.out.println(a);
		//�ε��� 2�� ���� ���� charAt()
		char c = a.charAt(2);
		System.out.println(c);
	}

}
