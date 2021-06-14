import java.util.*;
public class DisplayIndividualValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner obj = new Scanner(System.in);
          int n,a,sum=0;
          System.out.println("Enter numbers");
          n = obj.nextInt();
            while(n>0){
            	a = n%10;
            	System.out.println("Individual digits" + a);
            	n = n/10;
            	sum +=a;
            	   	
            }
            System.out.print(sum);
	}

}
