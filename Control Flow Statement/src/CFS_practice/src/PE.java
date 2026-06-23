package CFS_practice.src;

import java.util.*;

public class PE {

	void checkPE(int num) {

		if (num > 0) {

			System.out.println(num + " is a positive number");

			if (num % 2 == 0) {

				System.out.println(num + " is an even number");
			}

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number = ");
		int num = sc.nextInt();

		PE pe = new PE();
		pe.checkPE(num);

		sc.close();

	}

}
