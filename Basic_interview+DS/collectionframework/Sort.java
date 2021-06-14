package collectionframework;
import java.util.*;
class Book implements Comparator
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
	    public int compare(Object o1, Object o2) {
		     Book book1 = (Book)o1;
		     Book book2 = (Book)o2;
		     if(book1.getPrice()<book2.getPrice())
		    	 return -1;
		     else
		    	 return 1;
		}   
	
}
/*class MyComp implements Comparator<Object>
{
	 public int compare(Object o1, Object o2) {
	     Book book1 = (Book)o1;
	     Book book2 = (Book)o2;
	     if(book1.getPrice()<book2.getPrice())
	    	 return -1;
	     else
	    	 return 1;
	}
}*/
public class Sort {

	public static void main(String[] args) {
      Book b1,b2,b3;
      b1= new Book();
      b3= new Book();
      b2= new Book();
	    b1.getDetails();
	    b2.getDetails();  b3.getDetails();
	    TreeSet t = new TreeSet(new Book());
	    t.add(b1);
	    t.add(b2);
	    t.add(b3);
	    
         Book b;
         Iterator it = t.iterator();
         System.out.println("Sorted details acc to price of books are");
         while(it.hasNext())
         {
        	 b = (Book)it.next();
                  	
        	 System.out.println(b.getTitle()+" - " +b.getPrice()+" Rs");
         }
         
         
	
	
	}

}
