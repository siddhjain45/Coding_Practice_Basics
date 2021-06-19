package arrayPrograms;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int arr[]= {1,2,1,5,2,7,6,6};
   int len=arr.length;
    int [] b = new int[len];
    int c=0;
      for(int i=0;i<len;i++)
      {
    	  c++;
    	  
    	  for(int j=i+1;j<len;j++) 
    	  {   c++;   
    		  if(arr[i]==arr[j])
    		  {c++;
    			  b[i]=arr[j];
    			  
    		  }
    		 
    	
    	  }
    	 
       }
      System.out.println(c);
      System.out.println("Duplicates Elements Are : ");
      for(int i=0;i<b.length;i++)
      {
    	  if(b[i]!=0)
    	  System.out.print(b[i]+" ");
      }
      
    	  
	}

}
