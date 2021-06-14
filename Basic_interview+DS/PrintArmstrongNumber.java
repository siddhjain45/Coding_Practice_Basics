import java.util.*;
public class PrintArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
     int i, from,to,rem,cubesum=0, temp;
        System.out.println("Enter armstrong nuumber start from");
        from = sc.nextInt();
        System.out.println("Enter ending of armsstrong num");
        to = sc.nextInt();
        for(i=from; i<=to; i++){
        	temp=i;
        	while(temp>0) {
        		rem = temp%10;
        		cubesum = cubesum+(rem*rem*rem);
        	    temp = temp/10;	
        	}
        	if(cubesum==i){
        		System.out.print(i + " ");
        	}
        	cubesum=0;
        }
		 
		
		
	}

}
