package Siddharth;
import java.lang.*;
import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner sc = new Scanner(System.in);
		StringBuffer s1 = new StringBuffer("sid");
		StringBuffer s2 = new StringBuffer();
		StringBuffer s3 = s1;
	    
	    
	  
		System.out.println(s1);
       
	  System.out.println(s1.reverse());
		if(s3.equals(s1.reverse())){
			System.out.println("Palindrome");
		}
		
		
	}

}
