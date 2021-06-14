
public class OddEvenCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int odd=0,even=0,n=77,i;
          for(i=n;i<=165;i++)
          {
        	  if(i%2==0)
        		  even++;
        		  else
        			  odd++;
        	  
          }
          
         System.out.println("No of odd digit is = " +odd);
         System.out.println("No of even di is = "+even);
	}

}
