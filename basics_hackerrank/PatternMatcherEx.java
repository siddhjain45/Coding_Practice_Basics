package hackerrankprogramsex;
import java.util.*;
import java.util.regex.*;
public class PatternMatcherEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
       String s = "([a-zA-Z0-9\\./]+)@([a-z]+).([a-z]{3})";
        Pattern p =Pattern.compile(s);
        Matcher r = p.matcher(line);
        if(r.find()) {
        	System.out.println("Matched");
        	System.out.println(r.group(1));
        	System.out.println(r.group(2));
        	System.out.println(r.group(3));
        }
        else
        {
        	System.out.println("No math");
        }
	}

}
