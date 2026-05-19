import java.util.*;

public class Ranking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Graduation CGPA");
		float marks = sc.nextFloat();
		
		// 4) Check ranking
		
		if (marks >= 9.0) {
			System.out.println("Grade A++");
		} else if (marks >= 8.1 && marks <= 8.9) {
			System.out.println("Grade A+");
		} else if (marks >= 7.1 && marks <= 8.0) {
			System.out.println("Grade B+");
		} else if (marks >= 6.1 && marks <= 7.0) {
			System.out.println("Grade B");
		} else if (marks >= 5.1 && marks <= 6.0) {
			System.out.println("Grade C");
		} else {
			System.out.println("Grade less D");
		}
	}
}
