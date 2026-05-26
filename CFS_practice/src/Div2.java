import java.util.*;

public class Div2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number = ");
		int num = sc.nextInt();

		if (num % 2 == 0) {

			System.out.println(num + " is divisible by 2");
		} else {
			System.out.println(num + " is not divisible by 2");
		}
	}

}
