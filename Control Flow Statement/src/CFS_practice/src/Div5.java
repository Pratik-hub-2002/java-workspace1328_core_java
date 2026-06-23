package CFS_practice.src;

import java.util.*;

public class Div5 {

	void checkDiv5(int num) {

		if (num % 5 == 0) {
			System.out.println(num + " is divisible by 5.");
		} else {
			System.out.println(num + " is not divisible by 5");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number = ");
		int num = sc.nextInt();

		Div5 d = new Div5();
		d.checkDiv5(num);
	}
}
