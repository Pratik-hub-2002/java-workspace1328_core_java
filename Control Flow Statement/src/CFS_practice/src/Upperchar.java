package CFS_practice.src;

import java.util.*;

public class Upperchar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any char ");
		char c = sc.next().charAt(0);

		if (c >= 'A' && c <= 'Z') {

			System.out.println(c + " is a Uppercase Character");

		} else {
			System.out.println(c + " is not a Uppercase Character");
		}
	}
}
