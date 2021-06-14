package arrays;
import java.util.*;
public class SumOf2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int sum[][] = new int[3][3];
      int a[][] = new int[3][3];
      int b[][] = new int[3][3];
      int i , j;
      int sizea = a.length;
      int sizeb = b.length;
      System.out.println("Enter 9 Elements of A Matrix");
      for(i=0; i<3; i++){
    	  for(j=0; j<3; j++){
    		  System.out .print("Enter Element a" + (i+1) + (j+1)+" : ");
    		  a[i][j] = sc.nextInt();
    		  System.out.println();
    	  }
      }
      System.out.println("Enter 9 Elemnts of B Matrix");
      for(i=0; i<3; i++){
    	  for(j=0; j<3; j++){
    		  System.out.print("Enter Element b"+(i+1)+(j+1) + " : ");
    		  b[i][j] = sc.nextInt();
    		  System.out.println();
    	  }
      }
      for(i=0; i<3; i++){
    	  for(j=0; j<3; j++){
               sum[i][j]=0;
    		 sum[i][j] += a[i][j] + b[i][j]; 
    		  
    	  }
      }
      System.out.println("Sum of A and B is ");
      for(i=0; i<3; i++){
    	  for(j=0; j<3; j++){
    		  System.out.print("Elemens s"+(i+1)+(j+1)+" : "+sum[i][j]);
    		  System.out.println();
    	  }
    	  
      }
		
		
		
		
	}

}
