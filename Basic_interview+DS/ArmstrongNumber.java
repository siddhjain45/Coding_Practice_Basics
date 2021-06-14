import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n,m,a,cubesum=0;
     Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number to check armstrong or not");
        n = sc.nextInt();
        m=n;
        while(n>0){
        	a = n%10;
        	cubesum = cubesum+(a*a*a);
        n=n/10;
        
        }
        if(m==cubesum){
        	System.out.println("No is armstrong no");
        }
        else{
        	System.out.println("No is not armstrong number");
        }
	
	}
	   
	
	
	

}
