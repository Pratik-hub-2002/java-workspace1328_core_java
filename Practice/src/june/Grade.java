package june;

import java.util.Scanner;

public class Grade {

	public String Gra(int marks) {

		if (marks >= 90) {
			return "\nGrade A";
		} else if (marks >= 75) {
			return "\nGrade B";
		} else if (marks >= 55) {
			return "\nGrade C";
		} else if (marks >= 40) {
			return "\nPass";
		} else {
			return "\nFail";
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks = ");
		int marks = sc.nextInt();

		Grade g = new Grade();

		String result = g.Gra(marks);

		System.out.println("Congratulations you got !!!" + result);

		sc.close();
	}
}
