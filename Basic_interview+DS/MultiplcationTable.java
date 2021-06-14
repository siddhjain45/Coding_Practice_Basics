import java.util.Scanner;
import Ex33classobject.*;
public class MultiplcationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
       int i,mul=0,tab;
       System.out.println("Enter no for table ");
       tab = obj.nextInt();
       for(i=1; i<=10; i++)
       {
    	   mul = tab*i;
    	   System.out.println(tab + "*" + i + " = " + mul);
    	   mul = 0;
       }
			
          StudentMain s = new StudentMain();		
         s.main(null);
         Student St = new Student();
	       
	
	}
	
	

}
