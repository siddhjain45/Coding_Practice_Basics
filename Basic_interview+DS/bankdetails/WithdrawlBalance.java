package bankdetails;

public class WithdrawlBalance extends DepostiteAmount {
               	     
	public void withdrawlAmount(){
		 
		 System.out.println("Enter amount for Widrawl");
		 widamount = sc.nextInt();
		 if(widamount>bal){
			 System.out.println("Insufficient Balance ");
			 
		 }
		 bal = bal-widamount;
		 System.out.println("Account Balance after Widdraw  = " + bal);
				 
				 
	}
	

}
