package Ex33classobject;
import java.util.*;
public class Student {
           Scanner obj = new Scanner(System.in);
         private int m1,m2,m3,total,avg;
          private char grade;
          private String remark;
          private String name;
        public   void getName()
           {
        	   System.out.println("Enter student name");
        	   name = obj.nextLine();
           }
          public void getMarks()
           {
               System.out.println("Enter marks of maths");
               m1 = obj.nextInt();
               System.out.println("Enter marks of English");
               m2 = obj.nextInt();
               System.out.println("Enter marks of Hindi");
               m3 = obj.nextInt();
               total = m1+m2+m3;  
           }
           public void getGradeAndRemark()
           {
        	   if(total>=280)
        	   {
        		   grade = 'A';
        		   remark = "Excellent";
        	   }
        	   else if(total>=250)
        	   {
        		   grade = 'B';
        		   remark = "Very Good";		 
        	   }
        	   else if(total>=200)
        	   {
        		   grade = 'C';
        		   remark = "Good";
        	   }
        	   else if(total>=150)
        	   {
        		   grade = 'D';
        		   remark = "satisfactory";
        	   }
        	   else
        	   {
        		   grade = 'E';
        		   remark = "Fail Try again";
        	   }
        	   System.out.println("Grade you obtain is = " + grade);
        	   System.out.println("Remark  = " + remark);
           }
}
