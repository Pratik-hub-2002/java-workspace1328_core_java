import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 2) Check Bank Login
		
		System.out.println("Enter User Name");
		String name = sc.nextLine();

		System.out.println("Enter Your Password");
		String password = sc.nextLine();

		if (name.equals("Pratik Raut") && password.equals("Pratik@1234")) {
			System.out.println("Login Succesful ..!");
		} else {
			System.out.println("Invalid Credentials");
		}
	}
}
