package collectionframework;
import java.util.*;
import java.lang.*;
class Bookk 
{
	Scanner sc = new Scanner(System.in);
	private String title;
	private int price;
	public void getDetails(){
    	System.out.println("Enter Title of Book");
    	title = sc.nextLine();
    	System.out.println("Enter price");
    	price = sc.nextInt();
    }
	    public String getTitle(){
	    	return title;
	    }
	    public int getPrice(){
	    	return price;
	    }
	    	
}
class Student
{
	  Scanner sc = new Scanner(System.in);
	   private String name;
	   private int roll;
	   public void get(){
		   System.out.println("Enter name of student");
		    name = sc.nextLine();
		    System.out.println("Enter roll");
		    roll = sc.nextInt();
	   }
	   public String getname(){
		   return name;
	   }
	   public int getroll(){
		   return roll;
	   }
}
class MyComp implements Comparator<Object>
{
	 public int compare(Object o1, Object o2) {
	     Bookk book1 = (Bookk)o1;
	     Bookk book2 = (Bookk)o2;
	     Student st1 =(Student)o1;
	     Student st2 = (Student)o2;
	     if(book1.getPrice()<book2.getPrice() && st1.getroll()<st2.getroll())
	    	 return -1;
	     else
	    	 return 1;
	     
	    
	     
	 }
	
	 
}
public class SortByQueue {

	public static void main(String[] args) {
	Bookk b1,b2,b3;
	b1 = new Bookk();
	b2 = new Bookk();	
	b3 = new Bookk();
	//calling book methods
	b1.getDetails();
	b2.getDetails();
	b3.getDetails();
	Student s1,s2,s3;
	s1 = new Student();
	s2 = new Student();
	s3 = new Student();
	s1.get();s2.get();s3.get();
  PriorityQueue pq = new PriorityQueue(8,new MyComp());
         pq.offer(s1);
         pq.offer(s2);
         pq.offer(s3);
         pq.offer(b1);
         pq.offer(b2);
         pq.offer(b3);
         
        Iterator it = pq.iterator();
        Bookk b;
        Student s;
        while(it.hasNext())
        {
        	b = (Bookk)it.next();
        	s= (Student)it.next();
        	System.out.println(b.getTitle() + " = "+b.getPrice()+" RS");
        	System.out.println(s.getname()+" = "+s.getroll());
        }
         
         
   
  
  
	
	
	
	
	
	
	}

}
