package sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsData {
	private int id; //��ȣ
	private String text; //���� �޽��� ����
	private String to; //�߽���
	private int errorCode; //�����ڵ�
	private String sendTime; //���� �ð�
}
