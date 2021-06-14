import java.util.*;
import java.lang.*;

public class StringCountUpeerLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner obj = new Scanner(System.in);
       String s;
       int len,i;
       char ch;
       int upper=0, lower=0, digit=0;
       System.out.println("Enter string");
       s = obj.nextLine();
       len = s.length();
       
       for(i=0; i<len; i++)
       {
    	   ch = s.charAt(i);
    	   if(Character.isUpperCase(ch))
    	   {
    		   upper++;
    	   }
    	   if(Character.isLowerCase(ch))
    	   {
    		   lower++;
    	   }
    	   if(Character.isDigit(ch))
    		   digit++;
      }
       System.out.println("No of upper letter is = " + upper);
       System.out.println("No of lower leteer is = " + lower);
       System.out.println("No of digit is = " + digit);
       System.out.println("No of special char is = " + (len-(upper+lower+digit)));
       
       
	}

}
