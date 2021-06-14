package Ex5;

public class StringIntoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "Hello Sid";
		char ch[] = new char[st.length()];
for(int i=0; i<st.length(); i++)
{
	ch[i] = st.charAt(i);
}
   for(int i=0; i<st.length(); i++)
   {
	   System.out.println(ch[i]);
   }
	}

}
