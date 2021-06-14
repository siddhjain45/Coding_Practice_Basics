package Siddharth;
import java.util.*;

public class ShowDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner obj = new Scanner(System.in);
      String s1 = "siddharth jain";
      String s2 = "kushal jain";
      String s3 = "shubham jain";
      
      String add;
      String s;
      System.out.println("For details of clients ");
      System.out.println("Enter name of client  ");
      s = obj.nextLine();   
    
      System.out.println( "Length  "+s.length());
         if(s.equalsIgnoreCase(s1))
         {
        	
           	 add = "Nandan nagar indore";
        	 System.out.println("Detals are ");
        	 System.out.println("Mob. Number = 8989652152 ");
        	 System.out.println("ID nomber = 52 ");
        	 System.out.println("Address =  " + add);
        	 System.out.println("Profit rate = 25% ");
        	 System.out.println("Date of birth = " + "  01/10/2001");
         }
         else if(s.equalsIgnoreCase(s2))
         {

        	 add = "Ramandand nagar indore";
        	 System.out.println("Detals are ");
        	 System.out.println("Mob. Number = 8269036012 ");
        	 System.out.println("ID nomber = 47 ");
        	 System.out.println("Address =  " + add);
        	 System.out.println("Profit rate = 23% ");
        	 System.out.println("Date of birth = " + " 07/03/1998");
         }
         else if(s.equalsIgnoreCase(s3))
         {
        	
        	add = "Ashok nagar,indore";
        	 System.out.println("Detals are ");
        	 System.out.println("Mob. Number = 9993114795 ");
        	 System.out.println("ID nomber = 33 ");
        	 System.out.println("Address =  " + add);
        	 System.out.println("Profit rate = 24 ");
        	 System.out.println("Date of birth = " + "  14/07/1995");
         }
         else
         {
        	 System.out.println("No match found ");
        	 System.out.println("Try again");
         }
	}

}
