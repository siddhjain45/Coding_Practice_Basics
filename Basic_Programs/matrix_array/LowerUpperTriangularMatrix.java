package matrix_array;

import java.util.Scanner;

public class LowerUpperTriangularMatrix {
  public static void main(String[]arge)
  {
	  Scanner sc = new Scanner(System.in);
	     int row = sc.nextInt();
	     int col = sc.nextInt();
	     int a[][]= new int[row][col];
	     if(row!=col)
	    	 System.out.println("Matrix is should be Square Matrix");
	     else
	     {
	    	 int lower[][] = new int[row][col];
	    	 int upper[][] = new int[row][col];
	    	 System.out.println("Enter "+row*col+" Elements");
	    	 for(int i=0;i<row;i++)
	    	 {
	    		 for(int j=0;j<col;j++)
	    		 
	    			 a[i][j]=sc.nextInt();
	    		 
	    	 }
	    	 System.out.println("Matrix is = ");
	    	 for(int i=0;i<row;i++)
	    	 {
	    		 for(int j=0;j<col;j++)
	    			 System.out.print(a[i][j]+ " ");
	    		 
	    		 System.out.println();
	    	 }
	    	 // create lower triangular
	    	 for(int i=0;i<row;i++)
	    	 {
	    		 for(int j=0;j<col;j++)
	    		 {
	    			 if(j<=i)
	    				 lower[i][j]=a[i][j];
	    		 }
	    	 }
	    	 System.out.println("Lower Traingluar Matrix Are : ");
	    	 for(int i=0;i<row;i++)
	    	 {
	    		 for(int j=0;j<col;j++)
	    			 System.out.print(lower[i][j]+" ");
	    		 
	    		 System.out.println();
	    	 }
	    	 
	    	 //create Upper Traingular
	    	 for(int i=0;i<row;i++)
	    	 {
	    		 for(int j=0;j<col;j++)
	    		 {
	    			 if(j>=i)
	    				 upper[i][j]=a[i][j];
	    		 }
	    	 }
	    	 System.out.println("Upper Triangular matrix : ");
	    	 for(int i=0;i<row;i++)
	    	 {
	    		 for(int j=0;j<col;j++)
	    			 System.out.print(upper[i][j]+" ");
	    		 
	    		 System.out.println();
	    	 }
	    	 
	    	 
	     }//else end
  }
}
