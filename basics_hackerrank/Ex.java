package hackerrankprogramsex;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       char b;char c;
       for(int i=0;i<s.length();i++)
       {
    	   
    	   if(i%2==0)
    		 System.out.print(s.charAt(i));
    	   
    	  
       }
       System.out.print(" ");
       for(int j=0;j<s.length();j++)
       {
    	   if(j%2==1)
    	   {
    		   System.out.print(s.charAt(j));
    	   }
       }
       System.out.println();
       
	}

}
