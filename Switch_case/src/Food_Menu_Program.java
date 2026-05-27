import java.util.*;

public class Food_Menu_Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. PIZZA");
		System.out.println("2. BURGER");
		System.out.println("3. SANDWHICH");
		System.out.println("4. PASTA");

		System.out.println("\nSelect Your Menu = ");
		int menu = sc.nextInt();

		switch (menu) {

		case 1:
			System.out.println("PIZZA");
			break;
		case 2:
			System.out.println("BURGER");
			break;
		case 3:
			System.out.println("SANDWHICH");
			break;
		case 4:
			System.out.println("PASTA");
			break;
		default:
			System.out.println("Invalid Input");
		}

	}

}
