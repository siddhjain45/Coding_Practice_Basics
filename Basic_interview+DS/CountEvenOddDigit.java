import java.util.*;
public class CountEvenOddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
      int n,a,odd=0,even=0,count=0,m;
        System.out.println("Enter number ");
        n = sc.nextInt();
        m=n;
        int sum=0, evensum=0, oddsum=0, cubesum=0, cube=0;
        while(n>0){
        	n = n/10;
        	count++;
        	
        }
        while(m>0){
        	a = m%10;
        	if(a%2==0){
        		even++;
        		evensum = evensum+a;
        	}
        	else{
        		odd++;
        		oddsum = oddsum + a;
        	}
        	
        	System.out.print( a);
        	sum = a +sum;
        	cube = (a*a*a);
        	cubesum = cubesum +cube;
        	m = m/10;
        }
        System.out.println();
        System.out.println("No of digits  " + count);
        System.out.println("No of even digits  " + even);
        System.out.println("No of odd digits  " + odd);
        System.out.println("sum of digits  " + sum);
        System.out.println("sum of even digits  " + evensum);
        System.out.println("sum of odd digits  " + oddsum);
        System.out.println("sum of cube of digits  " + cubesum);
	}

}
