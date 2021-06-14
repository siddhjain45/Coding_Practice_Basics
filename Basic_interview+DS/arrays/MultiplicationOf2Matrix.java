package arrays;
import java.util.*;
public class MultiplicationOf2Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
		int mul[][] = new int[2][2];
		int a[][] = new int[2][3];
		int b[][] = new int[3][2];
		int i,j,k;
		System.out.println("Enter 6 elements of A matrix");
		for(i=0; i<2; i++){
			for(j=0; j<3; j++){
				System.out.print("Enter elemetn a"+ (i+1)+(j+1)+ " :");
	           a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter 6 elements of B matrix");
		for(i=0; i<3; i++){
			for(j=0; j<2; j++){
				System.out.print("Enter elemetn b"+ (i+1)+(j+1)+ " :");
	           b[i][j] = sc.nextInt();
			}
		}
		//to print in matrix form
		//for a
		System.out.println("Matrix A =  ");
		for(i=0; i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		//for b
		System.out.println("Matrix B =  ");
		for(i=0;i<b.length;i++) 
		{
			for(j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		//for multiplication
		for(i=0; i<2; i++){
			for(j=0; j<2; j++){
				mul[i][j]=0;
				for(k=0; k<3; k++){
					mul[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Multiplication of A & B matrix are ");
		for(i=0; i<2; i++)
		{
		  for(j=0; j<2; j++)
		  {
			  System.out.print("Element m"+(i+1)+(j+1)+" : " + mul[i][j]);
			  System.out.println();
		  }
		
		}
		//for matrix
		System.out.println("Matrix c(multiplication) =  ");
		for(i=0;i<mul.length;i++)
		{
			for(j=0;j<mul[i].length;j++)
			{
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
