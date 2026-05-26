import java.util.*;

public class Vcdsp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any character = ");
		char ch = sc.next().charAt(0);

		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

			if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U')) {

				System.out.println(ch + " is a vowel.");
			} else {
				System.out.println(ch + " is consonant.");
			}
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + " is a digit.");
		} else {
			System.out.println(ch + " is a special character.");
		}
		sc.close();
	}

}
