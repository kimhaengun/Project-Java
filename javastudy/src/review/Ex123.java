package review;

interface Helloable{
	void æ»≥Á();
}
public class Ex123 {
	static void start(Helloable h) {
		h.æ»≥Á();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		start(new Helloable() {
			//¿Õ∏Ì≈¨∑°Ω∫  
			@Override
			public void æ»≥Á() {
				// TODO Auto-generated method stub
				System.out.println("π›∞©Ω¿¥œ¥Ÿ.");
			}
		});
	}

}
