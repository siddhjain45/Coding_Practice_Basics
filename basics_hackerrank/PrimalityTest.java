package hackerrankprogramsex;

import java.math.BigInteger;

import java.util.*;

import com.sun.swing.internal.plaf.basic.resources.basic;
public class PrimalityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
      BigInteger b = new BigInteger(s);
        if(b.isProbablePrime(1))
        {
        	System.out.println("prime");
        }
        else
        	System.out.println("non prime");
       
	}
	 
	 

}
