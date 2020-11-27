package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Replay{
	private int id;
	private String text;
}

public class Json02 {
	public static void main(String[] args) {
		Replay cm = new Replay(1,"´ñ±Û1");
		
	}
}
