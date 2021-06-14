package arrays;
import java.util.Arrays;
public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[] = {2,1,3,5,6};
     int b[] = {2,4,5,3,4};
      int total =a.length+b.length;
      int c[] = new int[total];
      int count=0;
      for(int i=0; i<a.length; i++){
    	  c[i] = a[i];
    	  count++;
      }
      for(int i = 0;i<b.length;i++ ){
    	  c[count++] = b[i];
      }
      for(int i=0;i<total;i++)
      System.out.println(c[i]);
      
     
		
		
		
		
		
		
		
		
	}

}
