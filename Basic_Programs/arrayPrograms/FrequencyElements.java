package arrayPrograms;

public class FrequencyElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,4,5,1,1,2};
      int n = arr.length;
      int [] b = new int[n];
      int visit =-1,count=1;
      for(int i=0;i<n;i++)
      {
    	  count=1;
    	  for(int j=i+1;j<n;j++)
    	  {
    		  if(arr[i]==arr[j])
    		  {
    			  count++;
    			  b[j]=visit;
    		  }
    	  }
    	  //if the index is not visiting 
    	  if(b[i]!=visit)
    	  {
    		  b[i]=count;
    	  }
    	  
      }
      for(int i=0;i<b.length;i++)
      {
    	  if(b[i]!=visit)
    	  {
    		  System.out.print(arr[i]+"  -  "+b[i]);
    	  }
    	  System.out.println();
      }
      
      
      
      
      
      
	}

}
