import java.util.*;
//To print all jumping no. smaller than equal to X.
public class example2
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the value of X");
		int x=sc.nextInt();
		for (int i=0;i<=x;i++)
		{ 
			if(isjumping(i))
				System.out.print(i+"\n");
			
		}
				
	}
	public static boolean isjumping(int x)
	{   int y=x;
	    if(y>=0 && y<10)
	    	return true;
		while(y!=0)
		{
			int c1=y%10;
			int c2=(y%100)/10;
			y=y/10;
			if (Math.abs(c1-c2)==1)
				if(y%100>9)
				    continue;
				else
					return true;
			
			else
				return false;
			
		}
		return true;
	}
	
}