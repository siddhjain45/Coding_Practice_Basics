import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner obj = new Scanner(System.in);
     
	    int n,i,m,fl=0;
	    System.out.println("Enter number");
	    n = obj.nextInt();
	    m = n/2;
	    
	      if(n<=1){
	    	  System.out.println(n + "Is not prime number");
	      }
	      else{
         for(i=2; i<m; i++){
        	 if(n%i==0){
        		 System.out.println("not prime");
        		 fl =1;
        		break;
        	 }
         }
	      if(fl==0)
	    	  System.out.println("prime number");
	    
	    }
	
	
	}
	
	

}
