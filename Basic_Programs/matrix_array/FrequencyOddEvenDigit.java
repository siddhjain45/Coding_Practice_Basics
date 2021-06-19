package matrix_array;

public class FrequencyOddEvenDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{1,2,3},{2,6,5},{2,2,2}
		};
		int odd=0,even=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]%2==0)
					even++;
				else
					odd++;
			}
		}
  System.out.println("No of Even Numbers : "+even+"\nand Odd Numbers : "+odd);
	}

}
