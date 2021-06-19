package matrix_array;

public class SumOfEachRowAndColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{1,2,3},{2,6,5},{2,2,2}
		};
		int sum=0;
		for(int i=0;i<3;i++)
		{  sum=0;
			for(int j=0;j<3;j++)
			{
				sum+=a[i][j];
			}
			System.out.println("Sum of row "+(i+1)+" is : "+sum);
		}
		
		for(int i=0;i<3;i++)
		{  sum=0;
			for(int j=0;j<3;j++)
			{
				sum+=a[j][i];
			}
			System.out.println("Sum of column "+(i+1)+" is : "+sum);
		}
		
		
	}

}
