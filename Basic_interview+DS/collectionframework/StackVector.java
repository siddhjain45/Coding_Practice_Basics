package collectionframework;
import java.util.*;
 

public class StackVector {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
       Stack<String> s = new Stack<String>();
     try{  s.add("Java");
     s.add("php");
       s.add("Python");
        s.add("c2");
        s.push("Sidd");
        s.push("Sid");
        
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.get(1));
        ListIterator itr = s.listIterator();
        while(itr.hasNext()){
            System.out.println(s.pop());
            
        }
               
        
     }
     catch(EmptyStackException e){
         System.out.println("St5ack is empty");
     }
     
	}

}
