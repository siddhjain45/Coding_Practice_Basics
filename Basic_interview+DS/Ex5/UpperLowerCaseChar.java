package Ex5;
import java.util.*;
import java.lang.*;
public class UpperLowerCaseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner obj = new Scanner(System.in);
       char c1,c2;
       boolean b1,b2,b3,b4,b5,b6,b7,b8;
       System.out.println("Enter character 1");
       c1 = obj.next().charAt(0);
       System.out.println("Enter charater 2");
	   c2 = obj.next().charAt(0);
	   b1 = Character.isAlphabetic(c1);
	   b2 = Character.isAlphabetic(c2);
	   b3 = Character.isUpperCase(c1);
	   b4 = Character.isUpperCase(c2);
       b5 = Character.isLowerCase(c1);
       b6 = Character.isLowerCase(c2);
       b7 = Character.isLetter(c1);
       b8 = Character.isDigit(c2);
       char ch = Character.toUpperCase(c1);
       char ch2 = Character.toTitleCase(c2);
       System.out.println("C1 is alphabet  " + b1);
       System.out.println("C2 is alphabet  " + b2);
       System.out.println("C1 is uppercase  " + b3);   
       System.out.println("C2 is uppercase  " + b4);
       System.out.println("C1 is lowercase  " + b5);
       System.out.println("C2 is lowercase  " + b6);
       System.out.println("C1 is specialcharacter  " + b7);
       System.out.println("C2 is anydigit  " + b8);
       System.out.println(ch);
       System.out.println(ch2);
	}
	
	
	

}
