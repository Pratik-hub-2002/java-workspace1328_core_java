import java.util.*;

public class Elec_bill {

	static double rate = 9.6;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 6) Electricity Bill

		System.out.println("Enter electricity units consumed = ");
		int units = sc.nextInt();

		if (units >= 1 && units <= 100) {
			double bill = units * rate + 100;
			System.out.println("Electricity Bill = ₹ " + bill);
		} else if (units >= 101 && units <= 200) {
			double bill = units * rate + 300 ;
			System.out.println("Electricity Bill = ₹ " + bill);
		} else if (units >= 201 && units <= 300) {
			double bill = units * rate + 500;
			System.out.println("Electricity Bill = ₹ " + bill);
		} else if (units >= 301 && units <= 400) {
			double bill = units * rate + 700;
			System.out.println("Electricity Bill = ₹ " + bill);
		} else if (units >= 401 && units <= 500) {
			double bill = units * rate + 900;
			System.out.println("Electricity Bill = ₹ " + bill);
		} else if (units >= 501) {
			double bill = units * rate + 1200; 
			System.out.println("Electricity Bill = ₹ " + bill);
		}
	}
}
