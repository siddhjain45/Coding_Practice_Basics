package bankdetails;
import java.util.*;
public class AccountStatus {

	public static void main(String[] args) {
		WithdrawlBalance bank = new WithdrawlBalance();
        Scanner sc = new Scanner(System.in);
       
       try{
    	   String name;
        int ch1,ch2;
        System.out.println("Enter name of Account Holder");
        name = sc.nextLine();
        System.out.println("Account type : ");
        System.out.println(" 1.Saving Account ");
        System.out.println(" 2.Current Account ");
        System.out.print("Enter :  ");
        ch1 = sc.nextInt();
        switch(ch1){
        case 1 :
        	System.out.println("\n\t Welcome to your Saving Account Mr. " +name);
        	break;
        case 2 :
        	System.out.println("\n\tWelcome to your Current Account Mr. "+name);
        	break;
        }
        for(int i =0; i<5; i++){
        System.out.println();
        System.out.println("Choose your prefrence ");
        System.out.println(" 1.Check Account Balance ");
        System.out.println(" 2.Deposite Amount");
        System.out.println(" 3.Withdrawl Amount");
        System.out.println(" 4.Exit");
        System.out.print("Enter : ");
        ch2 =  sc.nextInt();
        switch(ch2){
        case 1 :
        	bank.accountBal();
        	break;
        case 2 :
        	bank.depositeAmount();
        	break;
        case  3 :
        	bank.withdrawlAmount();
        	break;
        case 4 :
        	System.out.println("   Thank you Have a nice Day!");
        	break;
        	
        }
        if(ch2==4)
     	   break;
        }
       }catch(Exception e){
    	   System.out.println(e);
       }
        
		
	}

}
