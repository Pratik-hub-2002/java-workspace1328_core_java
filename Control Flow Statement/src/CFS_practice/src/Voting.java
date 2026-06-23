package CFS_practice.src;

import java.util.*;

public class Voting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age = ");
		int age = sc.nextInt();

		if (age >= 18 && age <= 120) {

			System.out.println(age + " is eligible for voting.");
		} else {
			System.out.println(age + " is not eligible for voting.");
		}
	}
}
