import java.util.*;

public class Signal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 3) Check Traffic Signal
		
		System.out.println("Enter Signal");
		String signal = sc.next();

		if (signal.equals("Red") || signal.equals("red")) {
			System.out.println("Stop your vehicle");
		} else if (signal.equals("Yellow") || signal.equals("yellow")) {
			System.out.println("Slow your vehicle");
		} else if (signal.equals("Green") || signal.equals("green")) {
			System.out.println("You can go now");
		} else {
			System.out.println("Not Defined");
		}
	}
}
