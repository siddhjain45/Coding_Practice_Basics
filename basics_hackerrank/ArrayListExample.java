package datastructures;
import java.util.*;
public class ArrayListExample {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
         int n=sc.nextInt();
         for(int i=0;i<n;i++)
         {
        	 int d = sc.nextInt();
        	 ArrayList<Integer> list2 = new ArrayList<Integer>(d);
        	 for(int j=0;j<d;j++)
        	 {
        		 list2.add(sc.nextInt());
        	 }
        	 list.add(list2);
         }
         System.out.println("Enter n no if queries");
         int q = sc.nextInt();
         for(int j=0;j<q;j++)
         {
        	 int x = sc.nextInt();
        	 int y= sc.nextInt();
        	 try
        	 {
        		 System.out.println(list.get(x-1).get(y-1));
        	 }catch(IndexOutOfBoundsException e)
        	 {
        		 System.out.println("Error");
        	 }
        	 
        	 
         }
	}

}
