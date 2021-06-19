package matrix_array;

import java.util.Scanner;

/* -->matrix is said to be sparse matrix if most of the elements of that matrix are 0.
 *  It implies that it contains very less non-zero elements.
 *  
 *  -->To check whether the given matrix is the sparse matrix or not, 
 *  we first count the number of zero elements present in the matrix. 
 *  Then calculate the size of the matrix. For the matrix to be sparse, 
 *  count of zero elements present in an array must be greater than size/2.
 */
public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	     int row = sc.nextInt();
	     int col = sc.nextInt();
	     int a[][]= new int[row][col];
	     int halfLen = row*col;
	   int zero=0;
	   for(int i=0;i<row;i++)
	   {
		   for(int j=0;j<col;j++)
			   a[i][j]=sc.nextInt();
		   
	   }
	   
	   //check no of zero elements in matrix
	   for(int i=0;i<row;i++)
	   {
		   for(int j=0;j<col;j++)
		   {
			   if(a[i][j]==0)
				   zero++;
		   }
	   }
	   
	   if(zero>halfLen)
		   System.out.println("Matrix is sparse");
	   else
		   System.out.println("Matrix is not sparse");
	     
	}

}
