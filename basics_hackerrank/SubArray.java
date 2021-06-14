package hackerrankprogramsex;
import java.util.*;
public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int n[]=new int[4];
       for(int i=0;i<4;i++)
       {
    	   n[i]=sc.nextInt();
       }
       System.out.println("Subarrays are : ");
       for(int i=0;i<4;i++)
       {
    	   for(int j=i;j<4;j++)
    	   {
    		   for(int k=i;k<=j;k++)
    		   {
    			   System.out.print(n[k]+" ");
    		   }
    		   System.out.println();
    	   }
       }
	}

}
