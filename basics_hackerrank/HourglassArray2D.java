package hackerrankprogramsex;

import java.util.Scanner;

public class HourglassArray2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [][] n = new int[6][6];
       
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
        	for(int j=0;j<6;j++)
        	{
        		n[i][j]= sc.nextInt();
        	}
        }
        int sum=0;int maxsum=0;
        for(int a =0;a<4;a++)
        {
        	for(int b=0;b<4;b++)
        	{
        		sum=n[a][b]+n[a][b+1]+n[a][b+2]+n[a+1][b+1]+n[a+2][b]+n[a+2][b+1]+n[a+2][b+2];
        		if(sum>maxsum)maxsum=sum;
        	}
        }
        System.out.println(maxsum);
	}

}
