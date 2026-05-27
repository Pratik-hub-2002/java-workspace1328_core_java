import java.util.*;

public class Result_Status {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks = ");
		int marks = sc.nextInt();

		if (marks >= 0 && marks <= 100) {

			switch (marks / 10) {

			case 10:
			case 9:
			case 8:
				System.out.println("Distinction");
				break;

			case 7:
			case 6:
			case 5:
				System.out.println("Pass");
				break;

			default:
				System.out.println("Fail");
			}
		} else {
			System.out.println("Invalid Marks");
		}

	}

}
