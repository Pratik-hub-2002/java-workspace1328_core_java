import java.util.*;

public class Pos_num {
	
	void checkPos(int num){
	
	if( num > 0) {
		
		System.out.println(num +" is positive number.");
	}else {
		System.out.println(num+ " is not positive number.");
	}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number = ");
		int num=sc.nextInt();
		
		Pos_num p = new Pos_num();
		p.checkPos(num);
		
	}
}
