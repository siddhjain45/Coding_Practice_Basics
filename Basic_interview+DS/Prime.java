
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int i,j,fl,n=5,p=0;;
		  for(i=2; i<=n; i++){
			  fl = 0;
			  for(j=2; j<=i/2; j++){
				  if(i%j==0){
				  fl=1;
				  break;
				  }
			  }
			  if(fl==0){
				  p++;
				  System.out.print(i + " ");
			  }
		  }
		  System.out.println(p);
		
		
	}

}
