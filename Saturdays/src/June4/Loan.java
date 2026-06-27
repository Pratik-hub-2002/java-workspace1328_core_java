package June4;

import java.util.Scanner;

public class Loan {

	public void loan(int age, int salary, Scanner sc) {

		if (age >= 21) {
			
			if (salary >= 25000) {
				
				
				
			}else {
				System.out.println("Salary should be INR25000 or more");
			}
		}else {
			System.out.println("Age should be 21 or more ");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your age = ");
		int age = sc.nextInt();

		System.out.println("Enter your salary = ");
		int salary = sc.nextInt();

		System.out.println("Enter your CIBIL score = ");
		int cibil = sc.nextInt();

	}
}
