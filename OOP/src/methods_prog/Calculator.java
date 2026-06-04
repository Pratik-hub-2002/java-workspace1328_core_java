package methods_prog;

public class Calculator {

	// 5th Calculator
	public void add(int a, int b) {

		System.out.println("\n" + a + " + " + b + " = " + (a + b));
	}

	public void sub(int a, int b) {

		System.out.println("\n" + a + " - " + b + " = " + (a - b));
	}

	public void mul(int a, int b) {

		System.out.println("\n" + a + " * " + b + " = " + (a * b));
	}

	public void div(int a, int b) {

		if (b != 0) {
			System.out.println("\n" + a + " / " + b + " = " + (a / b));
		} else {
			System.out.println("Division by zero is not allowed.");
		}
	}

	public void cal(int choice, int a, int b) {

		switch (choice) {

		case 1:
			add(a, b);
			break;

		case 2:
			sub(a, b);
			break;

		case 3:
			mul(a, b);
			break;

		case 4:
			div(a, b);
			break;

		default:
			System.out.println("Invalid Choice");
		}
	}

}
