import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner obj = new Scanner(System.in);
      int n,fact=1,i;
      System.out.println("Enter a number for factorial ");
      n = obj.nextInt();
      
     for(i=1; i<=n; i++){
    	  fact = fact*i;
    	  System.out.print(i + "*" );
     }
        
        System.out.print(" = " + fact);
	}

}
