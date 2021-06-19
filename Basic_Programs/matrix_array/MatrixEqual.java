package matrix_array;

public class MatrixEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[][]= {
		   {1,2,3},{4,5,6},{7,8,9}
   };
   int b[][]= {
		   {1,2,3},{4,5,6},{7,8,9}
   };
   if(a.length!=b.length)
	   System.out.println("Matrix are not Equal{length }");
   else
   {
	   boolean f=true;
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=0;j<a.length;j++)
		   {
			   if(a[i][j]==b[i][j])
			       continue;	   
			   else {
				   f=false;
				   break;
			   }
				   
		   }
	   }
	   if(f)
		   System.out.println("Both Matrix Are Equal");
	   else
		   System.out.println("Both Matrix are UnEqual");
   }
	}

}
