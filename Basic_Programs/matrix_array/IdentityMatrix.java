package matrix_array;

import java.util.Scanner;
/* A matrix is said to be an identity matrix
 *  if it is a square matrix in which elements of principle diagonal are ones, 
 * and the rest of the elements are zeroes.
 */
public class IdentityMatrix {

	public static void main(String[] args) {

		  Scanner sc = new Scanner(System.in);
		     int row = sc.nextInt();
		     int col = sc.nextInt();
		     int a[][]= new int[row][col];
		     if(row!=col)
		    	 System.out.println("Matrix is should be Square Matrix");
		     else
		     {
		    	 System.out.println("Enter "+row*col+" Elements");
		    	 for(int i=0;i<row;i++)
		    	 {
		    		 for(int j=0;j<col;j++)
		    		 
		    			 a[i][j]=sc.nextInt();
		    		 
		    	 }
		    	boolean check=true;
		        //Check identity matrix or not
		    	 for(int i=0;i<row;i++)
		    	 {
		    		 for(int j=0;j<col;j++)
		    		 {
		    			 if(j==i)
		    			 {
		    				 if(a[i][j]!=1)
		    				 {
		    					 check=false;
		    					 break;
		    				 }
		    				 
		    					 
		    			 }
		    			 else
		    			 {
		    				 if(a[i][j]!=0)
		    				 {
		    					 check=false;
		    							 break;
		    				 }
		    					 
		    			 }
		    				 
		    		 }
		    	 }
		
		    	 if(check)
		    		 System.out.println("Matrix is Identity Matrix");
		    	 else
		    		 System.out.println("Matrix is not identity matrix");
		     }//else end
	}

}
