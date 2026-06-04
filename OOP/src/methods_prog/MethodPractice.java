package methods_prog;

public class MethodPractice {

	// 1st Find Square
	public int square(int num) {

		return num * num;
	}

	// 2nd Even or Odd
	public void evenOdd(int num1) {

		if (num1 % 2 == 0) {

			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	// 3rd Reverse program

	public int reverse(int num3) {

		int rev = 0;

		while (num3 > 0) {

			int rem = num3 % 10;
			rev = rev * 10 + rem;
			num3 = num3 / 10;
		}
		return rev;
	}

	// 4th Grade
	public void grade(int marks) {

		if (marks >= 90) {
			System.out.println("Grade A+");
		} else if (marks >= 80) {
			System.out.println("Grade A");
		} else if (marks >= 70) {
			System.out.println("Grade B");
		} else if (marks >= 60) {
			System.out.println("Grade C");
		} else if (marks >= 50) {
			System.out.println("Grade D");
		} else {
			System.out.println("Fail");
		}
	}

	// 6th Cube

	public int cube(int num4) {

		return num4 * num4 * num4;
	}
}
