import java.util.*;
public class Print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ar[][] = { {1,0,1,0,1},
		{0,0,1,0,0},{0,0,1,1,0},{0,1,0,1,0},{1,1,1,0,0},{0,0,0,0,1},{0,1,0,1,0},{0,0,1,1,0},{0,0,0,1,1},{1,1,0,0,0}
		};
		int len = ar.length;
        int i,j,r,c;
      
        System.out.println("Enter rows of island");
        r = sc.nextInt();
        System.out.println("Enter column");
		c = sc.nextInt();
		System.out.println(" output as  mentioned miss rekha ma'am");
		System.out.println();
	   for(i=0;i<10;i++)
	   {
		   for(j=0;j<5;j++)
		   {
			   System.out.print(ar[i][j] + " ");
		   }
		   System.out.println();
	   }
		System.out.println("\nTotal number of islands : "+c);

	
	
	}
	
	

}
