package hackerrankprogramsex;

import java.util.Scanner;

public class SubArrayNegativeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int []a=new int[n];
           for(int i=0;i<a.length;i++)
           {
        	   a[i]=sc.nextInt();
           }
           //subaray and neg sum
           int sum=0;
           int negsum=0;
           for(int i=0;i<a.length;i++)
           {
        	   for(int j=0;j<a.length;j++)
        	   {
        		   sum=0;
        		   for(int k=i;k<=j;k++)
        		   {
        			   sum=sum+a[k];
        		   }
        		   if(sum<0)
        		   {
        			   negsum+=1;
        		   }
        	   }
           }
           System.out.println(negsum);
           
           
	}

}
