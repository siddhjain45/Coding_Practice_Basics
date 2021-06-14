package arrayPrograms;

public class LeftRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[]= {1,2,3,4,5};
       int len = arr.length;
     
       /* Rotate only one time
        *   int first = arr[0];
       for(int i =1;i<len;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
       System.out.print(first);
       */
       
       //Rotate n times
       int n=3,first;
       System.out.println("Orignal arry : ");
       for(int i =0;i<len;i++)
       {
    	   System.out.print(arr[i]+" ");
       }
      
       for(int i=0;i<n;i++)
       {
    	   first = arr[0];
    	   int j;
    	   for( j=0;j<len-1;j++)
    	   {
    		   arr[j] = arr[j+1];
    	   }
    	   arr[j] = first;
       }
       System.out.println("Left rotate by "+n+" times : ");
       for(int i =0;i<len;i++)
       {
    	   System.out.print(arr[i]+" ");
    	   
       }
	}

}
