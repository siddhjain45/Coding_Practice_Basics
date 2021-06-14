package bankdetails;
import java.util.*;
public class Bank {
	
	   protected int bal=10000, depamount,widamount;
	   
	      Bank ()
	      {
	    	  System.out.println("\n\t\t   Welcome to ICICI Bank ");
	    	  System.out.println("\n");
	    	  
	      }

}
class AccountBalance extends Bank{
	  public void accountBal(){
		  System.out.println(" Your Account Balance is  = " + bal);
	  }
	
}
class DepostiteAmount extends AccountBalance{
	Scanner sc = new Scanner(System.in);
	public void depositeAmount(){
		
		 
		 System.out.println("Enter the Deposite Amount ");
		 depamount = sc.nextInt();
		
		 bal = depamount+bal;
		 System.out.println("Acount balance after deposite is  = " + bal);
	}
	
	
}