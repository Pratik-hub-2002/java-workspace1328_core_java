package CFS_practice.src;

import java.util.*;

public class Grade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks = ");
		float m = sc.nextFloat();

		if (m >= 75) {
			System.out.println("Passed with Distinction");
		} else if (m >= 60) {
			System.out.println("Passed with First Class");
		} else if (m >= 50) {
			System.out.println("Passed with Second Class");
		} else if (m >= 35) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		sc.close();
	}

}
