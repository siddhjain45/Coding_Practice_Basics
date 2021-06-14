package arrays;
import java.util.*;

public class SumOfArray1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		  int i,sum=0;
		  int arr[] = new int[5];	 
		System.out.println("Enter 5 elements in arrays");
		for (i=0; i<5; i++){
			
			System.out.println("Enter Element" + (i+1) + ":  ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements you entered are ");
		for(i=0; i<5; i++){
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		System.out.println("Sum of the elements are = " + sum);
		
	}

}
