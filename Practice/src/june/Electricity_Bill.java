package june;

import java.util.Scanner;

public class Electricity_Bill {

	public double bill(double units, double rate_1, double rate_2, double rate_3) {

		if (units <= 100) {

			return units * rate_1;

		} else if (units <= 200) {

			return units * rate_2;
		} else {
			return units * rate_3;
		}

	}

	public static void main(String[] args) {

		double rate_1 = 5, rate_2 = 7, rate_3 = 10;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your consumed units = ");
		double units = sc.nextDouble();

		Electricity_Bill eb = new Electricity_Bill();
		double billAmount = eb.bill(units, rate_1, rate_2, rate_3);

		System.out.println("\nElectricity Bill for this month = Rs. " + billAmount);

		sc.close();
	}
}
