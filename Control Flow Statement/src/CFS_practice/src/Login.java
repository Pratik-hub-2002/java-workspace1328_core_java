package CFS_practice.src;

import java.util.*;

public class Login {

	void checkLogin(String username, String password) {

		if (username.equals("admin") && password.equals("admin@123")) {

			System.out.println("Succesfully Login");
		} else {
			System.out.println("Invalid Credentils");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Username = ");
		String username = sc.next();

		System.out.println("Enter Passowrd = ");
		String password = sc.next();

		Login l = new Login();
		l.checkLogin(username, password);

		sc.close();
	}

}
