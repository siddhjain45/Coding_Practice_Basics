package arrayPrograms;

import java.util.Arrays;

public class Sortos1s2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {0,1,1,2,2,0};
       int n = arr.length;
       int temp;
  //   Arrays.sort(arr);
       for(int i=0;i<n;i++)
       {
    	   for(int j =i+1;j<n;j++)
    	   {
    		   if(arr[i]>arr[j])
    		   {
    			   temp=arr[i];
    			   arr[i]=arr[j];
    			   arr[j]=temp;
    		   }
    	   }
       }
       
        for(int i =0;i<arr.length;i++)
        	System.out.print(arr[i]+" ");
	}

}
