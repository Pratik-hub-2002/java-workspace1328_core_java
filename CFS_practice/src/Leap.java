import java.util.*;

public class Leap {

	void checkLeap(int year) {

		if (year % 4 == 0) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter year = ");
		int year = sc.nextInt();

		Leap l = new Leap();
		l.checkLeap(year);

		sc.close();
	}

}
