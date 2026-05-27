import java.util.*;

public class Mobile_menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. WiFi");
		System.out.println("2. Bluetooth");
		System.out.println("3. Mobile Data");
		System.out.println("4. Airplane Mode");

		System.out.println("Enter number ");
		int menu = sc.nextInt();

		switch (menu) {

		case 1:
			System.out.println("WiFi");
			break;
		case 2:
			System.out.println("Bluetooth");
			break;
		case 3:
			System.out.println("Mobile Data");
			break;
		case 4:
			System.out.println("Airplane Mode");
			break;

		default:
			System.out.println("Invalid Input");
		}
	}

}
