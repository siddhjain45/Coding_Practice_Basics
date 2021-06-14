package calciusingoops;
import java.util.*;
		

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y;
		char c;

		System.out.println("Enter value of a");
		x=sc.nextInt();
		System.out.println("Enter value of b");
		y=sc.nextInt();
		Cal obj = new Cal(x,y);   //creating object of class
		System.out.println("Enter operations '+','-','*','/'");
		c = sc.next().charAt(0);
		Cal.getOperation(c);
		obj.calculate();

	}

}
