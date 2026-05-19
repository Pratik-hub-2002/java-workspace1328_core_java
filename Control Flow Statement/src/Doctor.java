import java.util.Scanner;

public class Doctor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1) Elegibity for Doctor

		System.out.println("Enter your Neet score = ");
		int neet_score = sc.nextInt();

		// Check

		if (neet_score >= 590 && neet_score <= 720) {
			System.out.println("Elegible for MBBS");
		} else if (neet_score >= 450 && neet_score <= 589) {
			System.out.println("Elegible for BAMS");
		} else if (neet_score >= 350 && neet_score <= 449) {
			System.out.println("Elegible for BHMS");
		} else if (neet_score >= 300 && neet_score <= 349) {
			System.out.println("Elegible for BDS");
		} else if (neet_score >= 250 && neet_score <= 299) {
			System.out.println("Elegible for Physiotherapist");
		} else {
			System.out.println("Not Elegible for Doctor");
		}
	}
}
