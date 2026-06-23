package CFS_practice.src;

import java.util.*;

public class Greater100 {

	void check(int num) {

		if (num > 100) {

			System.out.println(num + " is greater than 100.");
		} else {
			System.out.println(num + " is not greater than 100.");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number = ");
		int num = sc.nextInt();

		Greater100 g = new Greater100();
		g.check(num);
	}
}
