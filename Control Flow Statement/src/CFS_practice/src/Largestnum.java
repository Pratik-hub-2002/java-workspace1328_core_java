package CFS_practice.src;

import java.util.*;

public class Largestnum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num 1");
		float num1 = sc.nextFloat();

		System.out.println("Enter num 2");
		float num2 = sc.nextFloat();

		System.out.println("Enter num 3");
		float num3 = sc.nextFloat();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is Largest");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is Largest");
		} else {
			System.out.println(num3 + " is Largest");
		}
	}

}
