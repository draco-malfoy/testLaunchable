package mt.launchableDemo;

public class DemoApp {

	public static void main(String[] args) {
		int a = 10, b = 5;

		sum(a, b);

		substract(a, b);

		multiplication(a, b);
		
		System.out.println("to trigger push");

		System.out.println("to trigger push");
		
		division(a, b);

		power(a, b);
	}

	static int sum(int a, int b) {
		return a + b;
	}

	static int substract(int a, int b) {
		return a - b;
	}

	static int multiplication(int a, int b) {
		return a * b;
	}

	static int division(int a, int b) {
		return a / b;
	}

	static double power(int a, int b) {
		return Math.pow(a, b);
	}

}
