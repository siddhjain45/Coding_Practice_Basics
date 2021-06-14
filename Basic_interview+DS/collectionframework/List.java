package collectionframework;
import java.util.*;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li = new LinkedList<String>();
		ArrayList<Integer> al = new ArrayList<Integer>(10);
		ArrayList al1 = new ArrayList(10);
		al.add(2);
          al.add(43);
          al.add(42);
          al1.addAll(al);
          System.out.println(al1);
          al1.add(0, "Sid");
         
          System.out.println(al1);
          al1.addAll(al); 
          System.out.println(al1);
          li.add("Siddharth");
          li.add(0, null);
         System.out.println(li);
         Iterator itr = li.iterator();
         while(itr.hasNext()){
               Object ob = (String)itr.next();
        	 System.out.println(ob);
        	 
         }
      ArrayList ob = new ArrayList();
       
		
		
	}

}
