package calciusingoops;

public class Cal {
	  private int a,b;
	    static char op;
	    Cal(int x, int y){
	    	a=x;b=y;
	    }
	    public static void getOperation(char c){
	    	op = c;
	    }
	    public void calculate(){
	    	switch(op){
	    	 	       
	         case '+':
	      	   System.out.println("dd is " + (a+b));
	      	   break;
	         case '-':
	      	   System.out.println("Sustracion is" + (a-b));
	      	   break;
	         case '*':
	      	   System.out.println("Multiply is " + (a*b));
	      	   break;
	         case '/':
	      	   System.out.print("Divide is " + (a/b));
	      	   break;
	      	   default :
	      		   System.out.print("Not found ");
	      		   break;
	    	}   
	    	}

}
