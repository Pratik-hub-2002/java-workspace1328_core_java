package CFS_practice.src;

import java.util.*;

public class Elc_Bill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter consumed units = ");
		float units = sc.nextFloat();

		if (units <= 100) {

			float bill = units * 5;

			System.out.println("For " + units + " units used bill is Rs. " + bill);

		} else if (units > 100 && units <= 200) {

			float bill = units * 7;

			System.out.println("For " + units + " units used bill is Rs. " + bill);
		} else if (units > 200) {
			float bill = units * 10;

			System.out.println("For " + units + " units used bill is Rs. " + bill);
		}

	}

}
