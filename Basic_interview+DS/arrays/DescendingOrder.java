package arrays;
import java.util.Scanner;
public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,i,j,temp=0;
		System.out.println("Enter size of array");
		n = sc.nextInt();
		 int arr[] = new int[n];
		int size = arr.length;
		System.out.println("Enter " +size+" elements ");
		for(i=0; i<size; i++)
		{
			arr[i] = sc.nextInt();
		}
		 //sort array in desscending
        for(i=0; i<size; i++)
		{
			for(j=(i+1); j<size; j++)
			{
				if(arr[i]<arr[j]){
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
			System.out.println();
			System.out.println("Desscending order of array is ");
          for(i=0; i<size; i++)
          {
        	  System.out.print(arr[i]+ " ");
          }
		
	
		
	}
}
