package Ex5;
import java.util.*;

public class BiggestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner obj = new Scanner(System.in);
   int a,b,c,big;
   System.out.println("enter value of a");
	a = obj.nextInt();
	System.out.println("Enter value of b");
	b= obj.nextInt();
	System.out.println("Enter value of c ");
	c = obj.nextInt();
	if(a>b)
	{
		if(a>c)
		{
			big = a;
			
		}
		else{
			big = c;
		}
	}
	else if(b>a)
	{
		if(b>c)
		{
			big = b;
		}
		else {
			big = c;
		}
	}
	else 
	{
		big = c;
	}
	
	System.out.println("Biggest value between those three is = " + big);
	
	
	
	
	
	
	
	}
	
	

}
