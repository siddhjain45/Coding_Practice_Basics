package arrayPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
 * Given an array/list “Arr” of integers and a position ‘M’, you have to reverse the array after that position.
Example:
We have an array Arr = {1, 2, 3, 4, 5, 6} and M = 3 , considering 0 
based indexing so the subarray {5, 6} will be reversed and our 
output array will be {1, 2, 3, 4, 6, 5}.
 * */
public class ReverseArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 ArrayList<ArrayList<Integer> > b = new ArrayList<ArrayList<Integer>>();
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int m = sc.nextInt();
       ArrayList<Integer> a = new ArrayList<Integer>(n);
      
       for(int i=0;i<n;i++)
       {
    	   a.add(sc.nextInt());
       }
   //  List<Integer> sub=  a.subList(m+1, n);
         Collections.reverse(a.subList(m+1, n));
      //   a.addAll(sub);
         System.out.println();
        /* for(int c:a)
         {
        	 System.out.print(c+" ");
         }
         System.out.println();*/
         b.add(a);
         t--;
		}
		for(ArrayList<Integer> c : b)
		{
			for(int i=0;i<c.size();i++)
			System.out.print(c.get(i)+ " ");
		
		System.out.println();
		}
		}

}
