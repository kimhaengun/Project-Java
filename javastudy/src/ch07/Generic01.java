package ch07;

import lombok.Data;

@Data
class ResponseDto<T>{ //<T> ���ʸ�
	private int statusCode; //200����, 300 �ٽ� ��û, 400 �߸��� ��û
	private T data;  //���ʸ� ������ �빮��(T) / �������� ���� Ÿ��
}

class Dog{
	
}
public class Generic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResponseDto<Integer> dto = new ResponseDto();
		dto.setStatusCode(200); //������� ���� ���̶�� ����
		dto.setData(1);
		
		System.out.println(dto.getStatusCode());
		System.out.println(dto.getData());
		if (dto.getStatusCode()==200) {
			System.out.println(dto.getData());
		}
	}

}
