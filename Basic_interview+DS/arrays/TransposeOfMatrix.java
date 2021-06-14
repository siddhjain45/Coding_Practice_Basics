package arrays;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { {1,2,3},
				      {4,5,6}, {7,8,9}};
		for(int i=0; i<a.length; i++)
		{
			   for(int j=0; j<a[i].length; j++){
				   System.out.print(a[i][j]+" ");
			   }
			   System.out.println();
		}
	   int ts[][] = new int[3][3];
	   for(int i=0; i<3; i++){
		   for(int j=0; j<3; j++){
			   ts[j][i] = a[i][j];
		   }
	   }
	   System.out.println("Transpose of Matrix A");
	   for(int i=0; i<ts.length;i++){
		   for(int j =0; j<ts[i].length;j++){
			   System.out.print(ts[i][j]+" ");
		   }
		   System.out.println();
	   }
		
		
		
		
		
		
		
		
	
	
	
		
		
		
		
		
		
		
		
		
	}

}
