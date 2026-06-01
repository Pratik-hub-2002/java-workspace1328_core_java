package Patterns;

public class L {

	public static void main(String[] args) {

//		for (int i = 1; i <= 5; i++) { // Column
//
//			for (int j = 1; j <= 5; j++) { // Rows
//
//				System.out.print("*"); // *****
		// *****
//			}
//			System.out.println();
//		}

//		for (int i = 5; i >= 1; i--) {
//
//			for (int j = 1; j >= 1; j++) {
//
//				System.out.println("*"); //*
//										//*
//			}
//
//			System.out.println();
//		}

//		for (int i = 5; i >= 1; i--) {
//
//			for (int j = i; j <= 5; j++) { 
//
//				System.out.print(" "); // *****
//										// ****
//										//  ***
//										//   **
//										//    *
//			}
//
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// Right Triangle
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 5; j >= 1; j--) {
//
//				System.out.print(" "); //  *
//										// **
//										// ***
//										// ****
//										// *****
//			}
//
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//
//				System.out.print(" "); //  *
//										// * *
//										// * * *
//										// * * * *
//										// * * * * *
//			}
//
//			for (int k = 1; k <= i; k++) {
//				System.out.print(" *");
//			}
//			System.out.println();
//		}

		// Inverted Right Triangle
//		for (int i = 5; i >= 1; i--) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");  // *****
//										// ****
//										// ***
//										// **
//										// *
//			}
//
//			System.out.println();
//		}

		// Right-Aligend Triangle
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= 5; j++) {
//				System.out.print(" ");  //     *
//										//    **
//										//   ***
//										//  ****
//										// *****
//			}
//
//			for (int k=1; k <=i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// Pyramid
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print(" ");  //     *
//										//    ***
//										//   *****
//										//  *******
//										// *********
//			}
//
//			for (int k = 1; k <= (2 * i - 1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// Inverted Pyramid
//		for (int i = 5; i >= 1; i--) {
//
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print(" ");  // *********
//										//  *******
//										//   *****
//										//    ***
//										//     *
//			}
//
//			for (int k = 1; k <= (2 * i - 1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		// Diamond Pattern
//		//upper pyramid
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print(" ");  //     *
//										//    ***
//										//   *****
//										//  *******
//										// *********
//										//  *******
//										//   *****
//										//    ***
//										//     *
//			}
//
//			for (int k = 1; k <= (2 * i - 1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//			// Lower Pyramid
//		for (int i = 4; i >= 1; i--) {
//
//			for (int j = 1; j <= 5 - i; j++) {
//				System.out.print(" ");  
//			}
//
//			for (int k = 1; k <= (2 * i - 1); k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// Hollow Square
//				for (int i = 1; i <= 5; i++) {
//
//					for (int j = 1; j <= 5; j++) {
//						
//						if(i==1 || i==5 || j==1 || j==5) {
//							
//							System.out.print("*");
//						}else {
//						System.out.print(" ");  // *****
//												// *   *
//												// *   *
//												// *   *
//												// *****		
//					}
//				}
//						System.out.println();				
//			}
		
		// Number Triangle
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <=i; j++) {
//
//				System.out.print(j);    //1
//										//12
//										//123
//										//1234
//										//12345
//			}
//			System.out.println();
//		}
		
		
		//Repeated Number Triangle
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <=i; j++) {
//
//				System.out.print(i);    //1
//										//22
//										//333
//										//4444
//										//55555
//			}
//			System.out.println();
//		}

		// Alphabet Triangle
//		for (char i = 'A'; i <= 'Z'; i++) {
//
//			for (char j ='A'; j <=i; j++) {
//
//				System.out.print(j);    //A
//										//AB
//										//ABC
//										//ABCD
//										//ABCDE 
//										//........Z
//			}
//			System.out.println();
//		}
		
		
		// Floyd's Triangle
//		int num =1;
//		
//		for (int i = 1; i <= 5; i++) {
//
//			for (int j =1; j <=i; j++) {
//
//				System.out.print(num+" ");
//				num++;
//										//1
//										//2 3
//										//4 5 6
//										//7 8 9 10
//										//11 12 13 14 15
//			}
//			System.out.println();
//		}
		
		//Hollow Pyramid
		int n=5;
		
		for (int i = 1; i <= n; i++) {

			for (int j =i; j <n; j++) {

				System.out.print(" ");
			}
			
			for(int j=1; j <=(2*i-1);j++) {
				if(i == n || j==1 || j== (2 * i -1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
										//   *
										//  *  *
										// *    *
										//*      *
										//*********
			}
			System.out.println();
		}
		}

}