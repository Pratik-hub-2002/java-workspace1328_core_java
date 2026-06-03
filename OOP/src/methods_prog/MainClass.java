package methods_prog;

public class MainClass {

	public static void main(String[] args) {

		System.out.println("\nNon-Parameterized Method Without Return Type\n");
		Method_prog m = new Method_prog();
		m.printName();
		m.add();
		m.evenOdd();
		m.largeNum();
		m.square();

		System.out.println("\nNon-Parameterized Method With Return Type\n");

		System.out.println("Name :- " + m.printName1());
		System.out.println("Addition :- " + m.add1());
		System.out.println("Even/Odd :- " + m.evenOdd1());
		System.out.println("Largest num :- " + m.largeNum1());
		System.out.println("Sqaure :- " + m.square1());

	}
}
