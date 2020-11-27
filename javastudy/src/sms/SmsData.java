package sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SmsData {
	private int id; //번호
	private String text; //문자 메시지 내용
	private String to; //발신자
	private int errorCode; //에러코드
	private String sendTime; //보낸 시간
}
