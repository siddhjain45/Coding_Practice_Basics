import java.util.*;
public class PowerOf2 {

      static boolean ispower2(int x)
     {
    	 if(x<=0){
    		 return false;
    	 }
    	 while(x!=1){
    		 if(x%2!=0){
    			 return false;
    	
    		 }
    		 x = x/2;
    	 }
    	 return true;
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
       int n;
       System.out.println("Enter number");
       n = sc.nextInt();
       boolean b = ispower2(n);
       if(b){
    	  System.out.println("No is power of 2");
       }
       else
       {
    	   System.out.println("No is not power of 2");
       }
      
        
      
  
	}

}
