package arrays;
import java.util.*;
public class LargestSmallestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      SumOfArray1D.main(null);
      int temp,i,j;
      int arr[] = new int[6];
      int size = arr.length;
      System.out.println();
      System.out.println();
      System.out.println("Enter 6 elements in arrays");
      for(i=0; i<6; i++){
    	  System.out.println("Enter Element  " + (i+1) + ":");
    	  arr[i] = sc.nextInt();
      }
      for(i=0; i<6; i++){
    	  for(j=(i+1); j<6; j++){
    		  if(arr[i]>arr[j]){
    			  temp = arr[i];
    			  arr[i] = arr[j];
    			  arr[j] = temp;
    		  }
    			  
    	  }
      }
      System.out.println("Largest value is = " + arr[size-1]);
      for(i=0; i<6; i++){
    	  for(j=(i+1); j<6; j++){
    		  if(arr[i]<arr[j]){
    			  temp = arr[i];
    			  arr[i] = arr[j];
    			  arr[j] = temp;
    		  }
    			  
    	  }
      
      }	
      System.out.println("small value is = " + arr[size-1]);
      
	}

}
