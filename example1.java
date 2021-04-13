
import java.io.*;
class example1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter string no. 1");
		String s1= br.readLine();
		System.out.println("Enter string no.2");
		String s2=br.readLine();
		System.out.println(s1+s2);
	}
	
}