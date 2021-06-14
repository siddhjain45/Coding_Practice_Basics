package collectionframework;
import java.util.*;
import Ex33classobject.Student;
class Boo
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
public class ExList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList ai = new ArrayList();
       /* Student s1,s2,s3;*/
        Book b1,b2;
        b1 = new Book();
        b2 = new Book();
       /* s1=new Student();
        s2=new Student();
        s3=new Student();*/
        b1.getDetails();
        b2.getDetails();
        ai.add(b1);
        ai.add(b2);
        /*ai.add(s1); 
        ai.add(s2);
        ai.add(s3);
        Student s;*/
        Book b;
       Iterator it = ai.iterator();
        while(it.hasNext())
        {
        	b = (Book)it.next();
        /*	s = (Student)it.next();
        	s.getName();
        	s.getMarks();
        	s.getGradeAndRemark();*/
        	
        	System.out.println("Details are  = "+ b.getTitle() +" - "+b.getPrice());
        }
        
        
          
		
	
	}

}
