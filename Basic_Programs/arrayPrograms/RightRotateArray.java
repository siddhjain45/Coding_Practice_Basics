package arrayPrograms;

public class RightRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[] = {5,6,4,8,7,4};
   int n=3,len=arr.length,temp;
   
   for(int i=0;i<n;i++)
   {
	   temp = arr[len-1];int j;
	   for( j=len-1;j>0;j--)
	   {
		   arr[j]=arr[j-1];
	   }
	   arr[0]=temp;
   }
   System.out.println("Right rotate array after "+n+" is : ");
   for(int k =0;k<len;k++)
	   System.out.print(arr[k]+" ");
   
   
   
	}

}
