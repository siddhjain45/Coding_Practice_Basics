package Ex4;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner obj = new Scanner(System.in);
       String name;
       int m1,m2,m3,total,perc;
       System.out.println("Enter name of student :");
       name = obj.nextLine();
       System.out.println("Enter marks of maths");
       m1 = obj.nextInt();
       System.out.println("Enter marks of English");
       m2 = obj.nextInt();
       System.out.println("Enter marks of Hindi");
       m3 = obj.nextInt();
       total = m1+m2+m3;
       perc = (total/3);
       System.out.println("Total marks = " + total);
       System.out.print("Percentage is = " + perc );
       System.out.print("%");
       
         
	}

}
