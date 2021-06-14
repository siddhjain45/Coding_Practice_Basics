package arrayPrograms;
import java.util.*;
public class KthLargestSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4,k=3;
		
    ArrayList<Integer> arr = new ArrayList<Integer>();
    ArrayList<Integer> brr = new ArrayList<Integer>();
     arr.add(1);
      arr.add(2);
      arr.add(5);
      arr.add(4);
     Collections.sort(arr);
      System.out.println(arr);
      //largest
      brr.add(arr.get(k-1));
    Collections.sort(arr, Collections.reverseOrder());
      brr.add(arr.get(k-1));
      //smallest
      System.out.println(brr);
	}

}
