package methods_prog;

public class Method_prog {

	// Non-Parameterized Method Without Return Type
	// 1st Create method to print your name
	public void printName() {

		System.out.println("Name :- Pratik Raut");
	}

	// 2nd Create method to add two numbers
	public void add() {

		int a = 25, b = 25;
		System.out.println("Addition of " + a + " + " + b + " = " + (a + b));
	}

	// 3rd Create method to check even or odd
	public void evenOdd() {

		int num = 105;

		if (num % 2 == 0) {

			System.out.println(num + " is Even");
		} else {
			System.out.println(num + " is Odd");
		}
	}

	// 4th Create method to find square of number
	public void square() {

		int num = 15;

		System.out.println("Square of " + num + " = " + (num * num));

	}

	// 5th Create method to return largest of two numbers
	public void largeNum() {

		int num = 75, num1 = 110;

		if (num > num1) {

			System.out.println(num + " is Greater than " + num1);
		} else {
			System.out.println(num1 + " is Greater than " + num);
		}

	}

	// Non-Parameterized Method With Return Type
	// 1st Create method to print your name
	public String printName1() {

		return "Kartik Patil";
	}

	// 2nd Create method to add two numbers
	public int add1() {

		int a = 225, b = 6625;
		return a + b;
	}

	// 3rd Create method to check even or odd
	public String evenOdd1() {

		int num = 2;

		if (num % 2 == 0) {

			return "Even";
		} else {

			return "Odd";
		}
	}

	// 4th Create method to find square of number
	public int square1() {

		int num = 30;

		return num * num;

	}

	// 5th Create method to return largest of two numbers
	public int largeNum1() {

		int num = 4546, num1 = 3565;

		if (num > num1) {

			return num;
		} else {
			return num1;
		}
	}
}