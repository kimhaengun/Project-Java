package ch04;

public class CalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator Calculator = new Calculator();
		int result = Calculator.add(10, 5);
		System.out.println(result);
		
		int result1 = Calculator.multi(result, 20);
		System.out.println(result1);
		
		int result2 = Calculator.divid(result1, 5);
		System.out.println(result2);
		
		int result3 = Calculator.minus(result2, 100);
		System.out.println(result3);
		
		
	}

}
