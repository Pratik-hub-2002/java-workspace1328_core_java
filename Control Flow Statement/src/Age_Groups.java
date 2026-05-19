import java.util.*;

public class Age_Groups {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 5) Age Groups

		System.out.println("Enter your age = ");
		int age = sc.nextInt();

		if (age <= 12) {
			System.out.println("Boy / Girl (Child)");
		} else if (age >= 13 && age <= 19) {
			System.out.println("Teenager");
		} else if (age >= 20 && age <= 59) {
			System.out.println("Man / Woman (Adult)");
		} else if (age >= 60 && age <= 120) {
			System.out.println("Old Man / Old Woman (Senior Citizen)");
		} else {
			System.out.println("Not Defined");
		}
	}
}
