package ch07;

import java.util.HashMap;

public class Hash01 {

	public static void main(String[] args) {
		// �ؽ����� key, value �� ���� �Է��� �� ����.
		// ã������ key������ ã�� �� ����.
		HashMap<String, String> hash = new HashMap<>();
		// String ��� Object�� ���� �� ��밡��
		hash.put("name", "ȫ�浿");
		hash.put("UserName", "ssar");
		hash.put("phone", "01050377036");
		
		System.out.println(hash.get("phone"));
		System.out.println(hash.containsKey("name"));
		System.out.println(hash.containsKey("ȫ�浿"));
	}

}