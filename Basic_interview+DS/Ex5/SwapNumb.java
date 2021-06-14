package Ex5;
import java.util.*;
public class SwapNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner obj = new Scanner(System.in);
        int a,b,temp;
      System.out.println("Before Swapping");
      System.out.println("Enter a");
      a = obj.nextInt();
      System.out.println("Enter b");
      b = obj.nextInt();
      
      temp = a;
      a=b;
      b=temp;
      System.out.println("After Swapping");
      System.out.println(" value of a = " + a);
      System.out.print("Value of b = " + b);
      
      
	}

}
