import java.util.*;

public class Character_Type {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter character = ");
		char ch = sc.next().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			switch (ch) {
			default:
				System.out.println("Uppercase Characters");

			}
		} else if (ch >= 'a' && ch <= 'z') {

			switch (ch) {
			default:
				System.out.println("Lowercase Characters");
			}
		} else if (ch >= '0' && ch <= '9') {

			switch (ch) {
			default:
				System.out.println("Digit");
			}
		} else {

			switch (ch) {
			default:
				System.out.println("Not Defined");
			}
		}
	}
}
