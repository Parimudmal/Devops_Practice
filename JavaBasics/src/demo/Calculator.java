package demo;

public class Calculator {
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void subtract(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		Calculator basiccal = new Calculator();
		basiccal.add(20, 30);
		basiccal.subtract(20, 30);
		basiccal.multiply(20, 30);
		basiccal.divide(20, 30);

	}

}
